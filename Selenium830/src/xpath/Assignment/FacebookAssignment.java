package xpath.Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAssignment {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		
		Set<String> allWindow = driver.getWindowHandles();
		
		for(String dtr:allWindow)
		{
			System.out.println(dtr);
		}
		Thread.sleep(6000);
		
		
	}

}
