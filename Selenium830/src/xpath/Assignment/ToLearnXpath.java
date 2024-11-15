package xpath.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//To Navigate to the website
		driver.get("https://demoapps.qspiders.com/");
		
		//it will navigate to the next link after clivking on the UI testing button
		driver.findElement(By.xpath("//p[contains(text(),'UI Testing Concepts')]")).click();
		
		//thread is given for better optimization
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Web Table']")).click();
		
		//here without thread it is not automatically navigating to the next link
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/../..//a[contains(text(),'Dynamic Web Table')]")).click();
		
		//here link is dynamic result occured only after applying thread.sleep .l 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//th[text()=\"Levi's Shirt\"]/following-sibling::td[5]/..//section/..//a")).click();
		driver.findElement(By.xpath("//button[text()='Yes']")).click();
		Thread.sleep(5000);
		driver.close();
		
	}

}
