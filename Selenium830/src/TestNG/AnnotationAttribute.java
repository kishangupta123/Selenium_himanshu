package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AnnotationAttribute {
	@Test(priority=2,invocationCount = 2  ,threadPoolSize = 5,enabled = false)
	public void login()
	{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
			driver.get("https://demowebshop.tricentis.com/login");
			Reporter.log("Login is Successful",true);
			driver.quit();
	}
	@Test(priority=1,invocationCount = 3,threadPoolSize = 8)
	public void register()
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		driver.get("https://demowebshop.tricentis.com/register");
		Reporter.log("Registration is successful",true);
		driver.quit();
	}

}
