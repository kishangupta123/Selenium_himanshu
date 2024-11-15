package com.qspiders.Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetAttribute {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		String value = driver.findElement(By.name("q")).getAttribute("placeholder");
		System.out.println(value);
		Thread.sleep(10000);
		driver.quit(); 
	}

}
