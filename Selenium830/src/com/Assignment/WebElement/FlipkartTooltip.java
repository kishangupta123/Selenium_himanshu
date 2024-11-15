package com.Assignment.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartTooltip {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		String toolTip = driver.findElement(By.name("q")).getAttribute("title");
		System.out.println(toolTip);
		
		Thread.sleep(7000);
		driver.close();
	}

}
