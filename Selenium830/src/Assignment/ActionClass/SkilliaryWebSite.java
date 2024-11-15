package Assignment.ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SkilliaryWebSite {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(40));
		
		driver.get("https://demoapp.skillrary.com/");
		driver.findElement(By.id("navbar-search-input")).sendKeys("Selenium",Keys.ENTER);
		driver.findElement(By.xpath("//b[text()='Selenium']")).click();
		Actions act=new Actions(driver);
		act.moveByOffset(216, 512).doubleClick().perform();
		
		Thread.sleep(4000);
		driver.close();
	}

}
