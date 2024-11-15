package com.qspiders.Synchronization;

import java.net.http.WebSocket;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnExplicitWait {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://www.shoppersstack.com/products_page/23");
		driver.findElement(By.id("Check Delivery")).sendKeys("560010");
		WebElement checkButton = driver.findElement(By.id("Check"));
		
		//explicit use
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));  
		 //condition
		wait.until(ExpectedConditions.elementToBeClickable(checkButton));  
		checkButton.click();
		WebElement delivery = driver.findElement(By.xpath("//div/..//p[@id='Check Delivery-helper-text']"));
		delivery.getText();
		if(delivery.getText().contains("Deliverable"))
		{
			System.out.println("Yes You're at Deliverable Location");
		}
		
		
	}

}
