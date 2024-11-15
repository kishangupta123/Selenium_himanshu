import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelfAssignment {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		driver.findElement(By.xpath("//a[text()='Sign In']")).click();
		WebElement usernameTF = driver.findElement(By.name("username"));
		usernameTF.clear();
		Thread.sleep(4000);
		usernameTF.sendKeys("j2ee");
		WebElement passwordTf = driver.findElement(By.name("password"));
		passwordTf.clear();
		Thread.sleep(3000);
		passwordTf.sendKeys("j2ee");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@src='../images/fish_icon.gif']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='FI-FW-02']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Add to Cart'][1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Proceed to Checkout']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Continue']")).submit();
		Thread.sleep(3000);
		try
		{
			driver.findElement(By.xpath("//a[text()='Confirm']")).submit();
		}
		catch(NoSuchElementException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			Thread.sleep(4000);
			driver.quit();
		}
		
	}

}
