package com.qspiders.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnClose {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		String sourceCode=driver.getPageSource();
		System.out.println(sourceCode);
		driver.close(); //it should be used in the last line of the progra oterwise it will throw exception
		
	}

}
