package com.qspiders.Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnClearMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		
		WebElement usernameTF = driver.findElement(By.id("username"));
		Thread.sleep(7000);
		usernameTF.clear();
		Thread.sleep(4000);
		usernameTF.sendKeys("admin");
		WebElement passwordTF = driver.findElement(By.id("password"));
		Thread.sleep(3000);
		passwordTF.clear();
		Thread.sleep(3000);
		passwordTF.sendKeys("admin");
		WebElement submitCredentials = driver.findElement(By.xpath("//button[text()='Sign in']"));
		
		//here submit is a method in which i have used in the clear method
		submitCredentials.submit();
		/* it must satisfy 2 condition then we can use the submit method
		 * 1-tag must contain type='submit'
		 * 2- element should be the child of <form> tag
		 */
		Thread.sleep(5000);
		driver.quit();
	}

}
