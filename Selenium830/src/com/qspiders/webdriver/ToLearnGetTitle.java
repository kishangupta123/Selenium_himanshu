package com.qspiders.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetTitle {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/"); //get method is  used to test application and navigate through the websites after entering the url
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Online Shopping Site for Mobiles"))
			//this was the additional part to check and match with title and then print
		{
			System.out.println("User Navigated Successfully");
		}
		else 
		{
			System.out.println("User failed to navigate");
		}
	}

}
