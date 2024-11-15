package com.qspiders.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnContainFunction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		driver.findElement(By.xpath("//input[contains(@aria-label,'username')]")).sendKeys("himu_speaks");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@aria-label,'Password')]")).sendKeys("12334 @#");
		driver.findElement(By.xpath("//div[text()='Log in']")).click();

	}

}
