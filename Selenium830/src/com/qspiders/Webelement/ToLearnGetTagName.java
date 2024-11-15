package com.qspiders.Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetTagName {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		String tagname = driver.findElement(By.linkText("Log in")).getTagName();
		System.out.println(tagname);
		Thread.sleep(5000);
		driver.close();
	}

}
