package com.qspiders.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnNavigate {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// driver.get("https://www.flipkart.com/");
		//driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().to(new String("https://www.flipkart.com/"));;
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();

	}

}
