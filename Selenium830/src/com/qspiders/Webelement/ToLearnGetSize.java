package com.qspiders.Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetSize {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		WebElement searchButton = driver.findElement(By.xpath("//input[@value='Search']"));
		Dimension size = searchButton.getSize();
		
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		Thread.sleep(4000);
		driver.close();
	}

}
