package xpath.Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToChangePositionOfaFlipkart {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.shoppersstack.com/products_page/15");
		Thread.sleep(20000);
//		String parentId = driver.getWindowHandle();
		driver.findElement(By.id("compare")).click();

		Set<String> allWindow = driver.getWindowHandles();

		for (String str : allWindow) 
		{
			driver.switchTo().window(str);
			System.out.println(driver.getCurrentUrl());
			Point pos = driver.manage().window().getPosition();
			
			if (driver.getCurrentUrl().equals("https://www.flipkart.com/")) 
			{
				driver.manage().window().setPosition(new Point(800, 250));

		    }
		}
			if(driver.getCurrentUrl().equals("https://www.ebay.com/"))
			{
				driver.manage().window().setPosition(new Point(10,250));
			}
			Thread.sleep(25000);
			driver.quit();
					

	}

}
