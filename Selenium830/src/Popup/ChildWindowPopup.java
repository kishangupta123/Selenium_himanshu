package Popup;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChildWindowPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(40));
		
		driver.get("https://www.shoppersstack.com/products_page/23");
		driver.findElement(By.id("compare")).click();
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		for(String id:allWindowHandles)
		{
			driver.switchTo().window(id);
			String url = driver.getCurrentUrl();
			if(url.contains("flipkart"))
			{
				break;
			}
		}
		driver.manage().window().maximize();
		Thread.sleep(6000);
		driver.close();
	}

}
