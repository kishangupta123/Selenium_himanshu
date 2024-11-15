package com.qspiders.xpath;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwitchTo {
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		  
		 driver.get("https://www.shoppersstack.com/products_page/15");
		  Thread.sleep(25000);
		  String parentId = driver.getWindowHandle();
		  driver.findElement(By.id("compare")).click();
		  
		  Set<String> allWindowIds = driver.getWindowHandles();
		  for(String str:allWindowIds)
		  {
			  driver.switchTo().window(str);
			  Thread.sleep(5000);
			  String url=driver.getCurrentUrl();
			  System.out.println(url);
			  
/*			  if(driver.getCurrentUrl().equals("https://www.ebay.com/"))
			  {
				  Dimension d = driver.manage().window().getSize();
				  System.out.println("Size of height is : "+d.getHeight());
				  System.out.println("Size is width: "+d.getWidth());
				
			  }*/
			 
			  
		  }
	}

}
