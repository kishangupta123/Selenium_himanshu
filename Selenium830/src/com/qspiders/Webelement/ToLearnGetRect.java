package com.qspiders.Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetRect {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Rectangle rect = driver.findElement(By.xpath("//input[@value='Search store']")).getRect();
		System.out.println("Height :"+rect.getHeight());
		System.out.println("Width :"+rect.getWidth());
		System.out.println("X Position :"+rect.getX());
		System.out.println("Y Position:"+ rect.getY());
		driver.close();
	}

}
