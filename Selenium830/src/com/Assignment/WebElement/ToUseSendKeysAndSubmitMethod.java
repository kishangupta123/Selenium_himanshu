package com.Assignment.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseSendKeysAndSubmitMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String url="https://demo.vtiger.com/vtigercrm/";
		
		 driver.get(url);
		driver.getCurrentUrl();
		if(driver.getCurrentUrl().equals(url))
		{
			System.out.println("Home Page Displayed");
		} 
		WebElement username = driver.findElement(By.name("username"));
		username.clear();
		Thread.sleep(4000);
		username.sendKeys("testing");
		
		WebElement passwordTf = driver.findElement(By.id("password"));
		passwordTf.clear();
		Thread.sleep(4000);
		passwordTf.sendKeys("Test@1234");
		WebElement submitButton = driver.findElement(By.xpath("//button[text()='Sign in']"));
		submitButton.submit();
		Thread.sleep(20000);
		
		driver.quit();
	}

}
