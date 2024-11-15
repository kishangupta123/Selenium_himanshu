package com.qspiders.Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnIsSelectedMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		WebElement goodRadioButton = driver.findElement(By.xpath("//label[text()='Good']/..//input[@type='radio']"));
		System.out.println("=====>Before Selecting<====");
		System.out.println(goodRadioButton.isSelected());
		goodRadioButton.click();
		System.out.println("=====>After Selecting<=====");
		boolean status = goodRadioButton.isSelected();
		if(status=true)
		{
			System.out.println("Radion Button For Good Is Selected: "+status);
		}
		Thread.sleep(10000);
		driver.close();
		
	}

}
