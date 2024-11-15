package Assignment.popup;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(45));
		
		driver.get("https://www.shoppersstack.com/products_page/23");
		driver.findElement(By.id("compare")).click();
		Set<String> allWindowHandles = driver.getWindowHandles();
		for(String ele:allWindowHandles)
		{
			driver.switchTo().window(ele);
			String url = driver.getCurrentUrl();
			if(url.contains("amazon"))
			{
				break;
			}
			
		}
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		act.scrollByAmount(300, 500).perform();
//		takeScreenshot(driver);
		
		Thread.sleep(19000);
		driver.quit();
		
	}
	public static void takeScreenshot(WebDriver driver) throws IOException
	{
		String time = LocalDateTime.now().toString().replace(":", "-");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshots/Popup/"+time+".png");
		FileHandler.copy(temp, dest);
		
	}

}
