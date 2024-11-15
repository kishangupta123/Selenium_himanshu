package com.qspiders.Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetLocation {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Point findLocation = driver.findElement(By.xpath("//input[@value='Search']")).getLocation();
		System.out.println(findLocation.getX());
		System.out.println(findLocation.getY());
		Thread.sleep(6000);
		driver.close();
		
		
	}

}
