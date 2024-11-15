package com.qspiders.Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetTextMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		String errorMsg = driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getText();
		System.out.println(errorMsg);
		if(errorMsg.contains("Login was unsuccessful"))
		{
			System.out.println("Error message is displayed");
		}
		else
		{
			System.out.println("Error Message is not displayed or incorrect");
		}
		Thread.sleep(7000);
		driver.close();
	}

}
