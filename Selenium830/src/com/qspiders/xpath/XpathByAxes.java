package com.qspiders.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAxes {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Ajit%20Choubey/OneDrive/Desktop/HTML/Selenium%20HTML/Movie.html");
		String collection = driver.findElement(By.xpath("//td[text()='KGF']/following-sibling::td[2]")).getText();
		System.out.println(collection );
	}

}
