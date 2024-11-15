package com.qspiders.locators;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnTagName {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		// driver.findElement(By.cssSelector("input[value='Search
		// store']")).sendKeys("HIMANSHU");
		// Selenium, a CSS Selector is a powerful method for locating elements on a web
		// page using CSS (Cascading Style Sheets) syntax. CSS Selectors can be used to
		// identify elements based on their tag name, ID, class, attributes, and even
		// their relationships to other elements.

		// driver.findElement(By.cssSelector("input[value='Search']")).click();

		for (WebElement ele : allLinks) {
			System.out.println(ele.getText());
		}

	}

}
