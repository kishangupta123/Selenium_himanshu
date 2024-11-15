package com.DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToReadDataFromPropertyFile {
	public static void main(String[] args) throws IOException, InterruptedException {
		//Step 1: Create Object from external files
		
		FileInputStream fis=new FileInputStream("./testData/skillraryData.properties");
		
		//Step 2: create respective file type object
		Properties prop=new Properties();
		
		//Step 3:
		prop.load(fis);
		String url = prop.getProperty("url");
		String username = prop.getProperty("Username");
		String password = prop.getProperty("Password");
		
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		
		
		driver.get(url);
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		driver.close();
		
	}

}
