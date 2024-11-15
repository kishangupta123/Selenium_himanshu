package com.qspiders.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetPageSourceOfRedBus {
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.redbus.in/");
	String source = driver.getPageSource();
	System.out.println(source);
	Thread.sleep(6000);
	driver.close();
	}
	

}
