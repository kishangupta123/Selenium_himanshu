package com.Assignment.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetTextToCaptureErrorOfvVtiger {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(3000);
		WebElement usernameTf = driver.findElement(By.id("username"));
		usernameTf.clear();
		Thread.sleep(2000);
		usernameTf.sendKeys("Testing");
		WebElement passwordTf = driver.findElement(By.id("password"));
		passwordTf.clear();
		Thread.sleep(3000);
		passwordTf.sendKeys("Test@123");
		WebElement signInTf = driver.findElement(By.xpath("//button[text()='Sign in']"));
		signInTf.submit();
		WebElement errorMsg = driver.findElement(By.id("validationMessage"));
		System.out.println(errorMsg.getText());
		
		String color=errorMsg.getCssValue("color");
		String fontSize=errorMsg.getCssValue("font-size");
		String fontFamily=errorMsg.getCssValue("font-family");
		
		System.out.println(color);
		System.out.println(fontSize);
		System.out.println(fontFamily);
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
