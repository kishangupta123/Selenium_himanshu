package Assignment.ActionClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyntraAction {
	public static void main(String[] args) throws InterruptedException, IOException {
		String time = LocalDateTime.now().toString().replace(":", "-");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(120));
		
		
		driver.get("https://www.myntra.com/");
		WebElement kidsHover = driver.findElement(By.partialLinkText("KIDS"));
		
		Actions act=new Actions(driver);
		act.clickAndHold(kidsHover).perform();
		WebElement ethnicWear = driver.findElement(By.partialLinkText("Ethnic Wear"));
		ethnicWear.click();
		
//		boolean status = ethnicWear.isDisplayed();
//		System.out.println(status);
		
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshots/"+time+".png");
		FileHandler.copy(temp, dest);
		
		Thread.sleep(6000);
		driver.close();
	}

}