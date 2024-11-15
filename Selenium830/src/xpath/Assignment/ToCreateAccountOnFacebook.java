package xpath.Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCreateAccountOnFacebook {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(7000);
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		switchToWindow(driver, "facebook");
		driver.findElement(By.xpath("//span[contains(text(),'Create new account')]")).click();
		switchToWindow(driver, "reg/?nex");
		
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(4000);
		driver.findElement(By.name("firstname")).sendKeys("Himanshu");
		

	}
	//Reusable Method oF SwitchToMethods
	public static void switchToWindow(WebDriver driver,String url)
	{
		Set<String> allWindowIds = driver.getWindowHandles();
		for(String id : allWindowIds)
		{
			driver.switchTo().window(id);
			String actUrl=driver.getCurrentUrl();
			if(actUrl.contains(url))
			{
				break;
			}
			
		}
	}

}
