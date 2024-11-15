package com.Assignment.WebElement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBus11 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.abhibus.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[text()='Hyderabad to Bangalore Bus'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a/..//span[text()='22 Sun']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[text()='Bus Partner']")).click();
		
		driver.findElement(By.xpath("//label[text()='BSR TOURS & TRAVELS']/..//input")).click();
		Thread.sleep(6000);
		
		List<WebElement> prices = driver.findElements(By.xpath("//strong[@class='h5 fare']"));
		System.out.println(prices.size());
		TreeSet<Integer> priceSet=new TreeSet<Integer>();
		
		for(WebElement ele:prices) {
			String actPrice = ele.getText().replace(",", "");
			int intPrice = Integer.parseInt(actPrice);
			priceSet.add(intPrice);
		}
		System.out.println(priceSet);
//		System.out.println(priceSet.last());
		System.out.println(priceSet.first());
		Thread.sleep(15000);
		driver.close();
		
		
//		ArrayList<Integer> list = new ArrayList<Integer>();
		
//		for (Iterator iterator = priceSet.iterator(); iterator.hasNext();) {
//			Integer integer = (Integer) iterator.next();
//			list.add(integer);
//		}
//		
////		System.out.println(list);
//		System.out.println(list.get(list.size()-2));
	}
}
