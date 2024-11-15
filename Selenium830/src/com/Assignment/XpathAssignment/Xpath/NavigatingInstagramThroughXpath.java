package com.Assignment.XpathAssignment.Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatingInstagramThroughXpath {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.instagram.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Contact Uploading & Non-Users')]")).click();
		List<WebElement> loader = driver.findElements(By.xpath("//h1 | //h2"));
		System.out.println(loader.size());

		for (WebElement ele : loader) {
			System.out.println("Heading Found : " + ele.getText());
		}
		Thread.sleep(5000);
		driver.quit();

	}

}
