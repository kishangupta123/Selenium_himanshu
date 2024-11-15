package com.Assignment.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureWebShopHeightWidth {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		boolean status = driver.findElement(By.xpath("//a[text()='Register']")).isDisplayed();
		if(status==true)
		{
			System.out.println("Yes Register Button Is Verified   ");
		}
		Rectangle location = driver.findElement(By.xpath("//input[@value='Subscribe']")).getRect();
		System.out.println("Height of Subscribe is :"+location.height);
		System.out.println("Widhth of Subscribe is :"+location.width);
		System.out.println("Position on X axis is :"+location.x);
		System.out.println("Postion on Y axis is :"+location.y);
		
		Thread.sleep(4000);
		driver.close();
		
				
	
	}

}
