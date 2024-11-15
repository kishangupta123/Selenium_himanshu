package com.DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;

import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToReadDataFromExcelFile {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		//Step-1
		FileInputStream fis=new FileInputStream("./testData/Book1.xlsx");
		
		
		//Step-2 create respective File Type Object
		Workbook workbook=WorkbookFactory.create(fis);	
		
		//Step-2: call read Methods
		String url = workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(url);
		String username = workbook.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(username);
		String password = workbook.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		System.out.println(password);
		String expectedResult = workbook.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
		System.out.println(expectedResult);
		double price = workbook.getSheet("Sheet1").getRow(1).getCell(4).getNumericCellValue();
		System.out.println(price);
		boolean status = workbook.getSheet("Sheet1").getRow(1).getCell(5).getBooleanCellValue();
		System.out.println(status);
		LocalDateTime date = workbook.getSheet("Sheet1").getRow(1).getCell(6).getLocalDateTimeCellValue();
		System.out.println(date);
		Month month = date.getMonth();
		int monthDate = date.getDayOfMonth();
		int year = date.getYear();
		System.out.println(month);
		System.out.println(monthDate);
		System.out.println(year);
		
		
		
		
//		
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(55));
//		driver.get(url);
//		driver.findElement(By.xpath("//a[text()='LOGIN']")).click();
//		
//		
//		driver.findElement(By.id("email")).sendKeys(username);
//		driver.findElement(By.id("password")).sendKeys(password);
//		String currentTitle = driver.getTitle();
//		driver.findElement(By.id("last")).click();
//		if(currentTitle.equals(expectedResult))
//		{
//			System.out.println("Welcome Page Navigated");
//		}
//		Thread.sleep(4000);
//		driver.close();
		 
		 
		
	}

}
