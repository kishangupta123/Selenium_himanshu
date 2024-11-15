package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Assignment.ActionClass.SkilliaryWebSite;

public class ToLearnStale {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		
		driver.get("https://demoapp.skillrary.com/");
		SkillRaryPage sp=new SkillRaryPage(driver);
		sp.getSearchTextField().sendKeys("Selenium",Keys.ENTER);
		Thread.sleep(4000);
		sp.getSearchTextField().sendKeys("Himanshu");
		
		
//		WebElement searchTf = driver.findElement(By.id("navbar-search-input"));
//		searchTf.sendKeys("Selenium",Keys.ENTER);
		Thread.sleep(4000);
		driver.close();
	}

}
