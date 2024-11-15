package Assignment.Synchronization;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class DemoQspiders {
	public static void main(String[] args) throws IOException, InterruptedException {
		String time = LocalDateTime.now().toString().replace(":", "-");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		System.out.println("a");
		driver.findElement(By.xpath("//a/..//section[text()='Web Table']")).click();
		System.out.println("b");
		WebElement webTableStatus = driver.findElement(By.xpath("//div/..//a[text()='Dynamic Web Table']"));
		webTableStatus.click();
		String status = webTableStatus.getText();
		System.out.println(status);
		
		String iphonePrice = driver.findElement(By.xpath("//th[text()='Apple iPhone']/following-sibling::td[4]")).getText();
		System.out.println("c");
		System.out.println(iphonePrice);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshots/"+time+".png");
		FileHandler.copy(temp, dest);
		Thread.sleep(5000);
		driver.close();
	}

}
