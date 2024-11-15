package com.ActionsClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnMouseHoverMoveByOffset {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(120));
		
		driver.get("https://www.myntra.com/");
		Actions act=new Actions(driver);
		act.moveByOffset(204, 49).perform();
		Thread.sleep(4000);
		driver.close();
	}

}
