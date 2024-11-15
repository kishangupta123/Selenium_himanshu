package Assignment.TakeScreenshots;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class FlipkartScreenhots {
	public static void main(String[] args) throws IOException, InterruptedException {
		String time = LocalDateTime.now().toString().replace(":", "-");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		if(driver.getCurrentUrl().contains("flipkart"))
		{
			System.out.println("Flipkart Page is Displayed");
		}
		
		WebElement searchTF = driver.findElement(By.name("q"));
		searchTF.sendKeys("MOBILE",Keys.ENTER);
		Thread.sleep(6000);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshots/"+time+".png");
		org.openqa.selenium.io.FileHandler.copy(temp, dest);
		Thread.sleep(9000);
		driver.close();
		
		
	}

}
