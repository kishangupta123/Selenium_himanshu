package com.qspiders.Synchronization;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import zmq.io.coder.raw.RawDecoder;

public class ToLearnImplicitTimeForWebElements {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://www.shoppersstack.com/");
		List<WebElement> allLinks = driver.findElements(By.id("a"));
		System.out.println(allLinks.size());
	}

}
