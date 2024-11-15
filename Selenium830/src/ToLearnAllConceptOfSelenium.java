import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnAllConceptOfSelenium {
	public static void main(String[] args) throws InterruptedException, IOException {
		String time = LocalDateTime.now().toString().replace(":", "-");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(100));
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement photoFrame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(photoFrame);
		System.out.println("Control Switch Into The Frame");
		
		
		//Drag And Drop Will Perform Through a Reusable Method
		callDragAndDrop(driver);
		System.out.println("Image has Been drag And Drop To The Trash And Vice Versa");
		
		//to take back control to the parent frame this below actions has performed
		driver.switchTo().parentFrame();
		System.out.println("Driver has Transfer Its Control to Parent Frame");
		
		driver.findElement(By.partialLinkText("CHEATSHEETS")).click();
		driver.navigate().back();
		driver.navigate().forward();
		System.out.println("Element has Clicked To CHEATSHEETS");
		
		
		//After Clicking It Will Transfer The Control to the New Window
		driver.findElement(By.partialLinkText("SQL Cheat Sheet")).click();
		System.out.println("Element Has Clicked To SQL Cheat Sheet");
		String parentWindow = driver.getWindowHandle();
		
		
		
		//It Will Capture The WindowHandles And Then Compare It With Each Other
		Set<String> allWindowHandle = driver.getWindowHandles();
		for(String handle:allWindowHandle)
		{
			if(handle!=parentWindow)
			{
				driver.switchTo().window(handle);
			}
		}
		
		//Xpath of the image which i have to Scroll Down and Take ScreenShota
		WebElement sqlIcon = driver.findElement(By.xpath("(//img[contains(@data-id,'6452')])[1]"));
		
		
		//ScrollDown Actions Will Perform To Capture The Screenshots Of Image
		Actions act=new Actions(driver);
		act.scrollToElement(sqlIcon).perform();
		//it is a reusable method to take screenshot
//		takeScreenshot(driver);
		
		//Now Control will transfer to the new or Parent window where Drag And Drop will Perform
		driver.switchTo().window(parentWindow);
		
		//To Navigate To The Drag&Drop Main PAge Navigate Actions Has Performed
		driver.navigate().back();
		
		//To Check Whether Control Is Performing The Actions It perform earlier or not iframe is used
		WebElement photoFrame1 = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(photoFrame1);
		callDragAndDrop(driver);
//		System.out.println("Again Drag And Drop Actions Performed");
		
		//control comes  from the iframe to parent frame
		driver.switchTo().parentFrame();
		
		//To Capture the ToolTip
		toolTip(driver);
//		takeScreenshot(driver);
		System.out.println("ToolTip is Successfully Captured");
		
		
		Thread.sleep(8000);
		driver.quit();
		
	}//ReUsable DragAndDrop Method
	public static void callDragAndDrop(WebDriver driver) throws IOException, InterruptedException
	{
		WebElement image1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement image2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement image3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement image4 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		WebElement trash = driver.findElement(By.id("trash"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(image1, trash).perform();
		act.dragAndDrop(image2, trash).perform();
		act.dragAndDrop(image3, trash).perform();
		act.dragAndDrop(image4, trash).perform();
		//Thread.sleep(3000);
//		takeScreenshot(driver);
		
		
		WebElement gallery = driver.findElement(By.id("gallery"));
		act.pause(5000);
		act.dragAndDrop(image1, gallery).perform();
		act.dragAndDrop(image2, gallery).perform();
		act.dragAndDrop(image3, gallery).perform();
		act.dragAndDrop(image4, gallery).perform();
		Thread.sleep(3000);
//		takeScreenshot(driver);
		
	}//ReUsable TakeScreenShots Method
	public static void takeScreenshot(WebDriver driver) throws IOException
	{
		String time = LocalDateTime.now().toString().replace(":", "-");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshots/"+time+".png");
		FileHandler.copy(temp, dest);
	}//ReUsable ToolTip Method
	public static void toolTip(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.xpath("(//span[text()='Tooltip'])[2]")).click();
		driver.findElement(By.id("Forms Based")).click();
		
		WebElement tollTipFrame = driver.findElement(By.xpath("(//iframe[@class='demo-frame lazyloaded'])[2]"));
		driver.switchTo().frame(tollTipFrame);
		
		String firstNameToolTip = driver.findElement(By.name("firstname")).getAttribute("title");
		System.out.println(firstNameToolTip);
		String lastNameToolTip = driver.findElement(By.name("lastname")).getAttribute("title");
		System.out.println(lastNameToolTip);
		String addressToolTip = driver.findElement(By.name("address")).getAttribute("title");
		System.out.println(addressToolTip);
	}

}
