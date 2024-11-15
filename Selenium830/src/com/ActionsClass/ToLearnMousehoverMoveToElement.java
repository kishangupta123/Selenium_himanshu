package com.ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnMousehoverMoveToElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(123));
		
		driver.get("https://www.myntra.com/");
		WebElement menLink = driver.findElement(By.partialLinkText("MEN"));
		WebElement womenLink = driver.findElement(By.partialLinkText("WOMEN"));
		WebElement beautyLink = driver.findElement(By.partialLinkText("BEAUTY"));
		Actions act=new Actions(driver);
		act.moveToElement(menLink).perform();
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Jackets")).click();
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
