package dataProviders;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToLearnDataProviders {
		
	
	@Test(dataProviderClass = DataStorage.class,dataProvider  = "loginData")
	public void login(String[] cred)
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.findElement(By.id("email")).sendKeys(cred[0]);
		driver.findElement(By.id("password")).sendKeys(cred[1]);
		driver.findElement(By.name("login")).click();
		Assert.assertEquals(driver.getTitle(),"SkillRary Ecommerce","UserLogin Failed" );
		Reporter.log("User Has Been SuccessFully LoggedIn",true);
	}
	

}
