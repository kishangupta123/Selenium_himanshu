package com.qspiders.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToLearnPartialLinkText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/"); 
		Thread.sleep(3000);
    	driver.findElement(By.partialLinkText("BOOKS")).click();
		
//		driver.findElement(By.partialLinkText("Shopping Cart")).click();
		

	}

}
