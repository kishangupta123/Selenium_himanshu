package com.qspiders.Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSendKeysMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement input = driver.findElement(By.id("navbar-search-input"));
		
		//send keys is used to send data to the field and keys is used perform keyboard operation
		input.sendKeys("Selenium",Keys.ENTER);
		
		// After typing key click on ctrl +space button to import and select options from given fields

	}

}
