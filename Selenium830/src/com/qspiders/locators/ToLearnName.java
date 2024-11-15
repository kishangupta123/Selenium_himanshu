package com.qspiders.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToLearnName {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.instagram.com/");
		driver.findElement(By.name("username")).sendKeys("93010234567");
		driver.findElement(By.name("password")).sendKeys("93010234567");
		driver.findElement(By.linkText("Log in")).click();
		                                                                                                                                                                                                                                                                                                                                                                                              
	}

}
