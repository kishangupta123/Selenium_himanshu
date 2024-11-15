package com.ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnDragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(40));
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		//First find out in Which Frame the Photo Frame IS reside Then write xpath for that
		WebElement photoFrame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(photoFrame);
		
		//write the xpath for source from where it will we taken and contain in a variable
		WebElement image1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement image2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement image3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement image4 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		
		//Target Locator in which the file is going to Transfer
		WebElement trash = driver.findElement(By.id("trash"));
		
		//Here The Action class Will Start Performing
		Actions act=new Actions(driver);
		act.dragAndDrop(image1, trash).perform();
		act.dragAndDrop(image2, trash).perform();
		act.dragAndDrop(image3, trash).perform();
		act.dragAndDrop(image4, trash).perform();
		
		System.out.println("All Images Successfully Transfer To the Trash");
		
		WebElement gallery = driver.findElement(By.id("gallery"));
		act.pause(5000);
		act.dragAndDrop(image1, gallery).perform();
		act.dragAndDrop(image2, gallery).perform();
		act.dragAndDrop(image3, gallery).perform();
		act.dragAndDrop(image4, gallery).perform();
		
		System.out.println("All 4 images successfully transfer to the Gallery");
		
		
		Thread.sleep(4000);
		driver.close();
		
		
		  
	}

}
