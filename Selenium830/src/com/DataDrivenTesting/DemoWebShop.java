package com.DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoWebShop {
	public static void main(String[] args) throws IOException, InterruptedException {
FileInputStream fis=new FileInputStream("./testData/commondata.properties");
		
		//Step 2: create respective file type object
		Properties prop=new Properties();
		
		//Step 3:
		prop.load(fis);
		String url = prop.getProperty("url");
		String email = prop.getProperty("email");
		String password = prop.getProperty("password");
		
		System.out.println(url);
		System.out.println(email);
		System.out.println(password);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		driver.get(url);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
