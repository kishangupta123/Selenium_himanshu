package assertion;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ToLearnSoftAssert {
	@Test
	public void login() throws IOException, InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		FileInputStream fis=new FileInputStream("./testData/commondata.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String url = prop.getProperty("url");
		String email = prop.getProperty("email");
		String password = prop.getProperty("password");
		
		driver.get(url);
		
		//Checkpoint will be checked if it is same then pass otherwise it will not termninate the execution
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(driver.getTitle(), "Demo Web", "Welcome Page is Not Displayed");
		Reporter.log("Welcome Page is Dispalyed",true);
		
		driver.findElement(By.linkText("Log in")).click();
		
		
		soft.assertEquals(driver.getTitle(), "Demo Web Shop. Login", "Login Page is Not Displayed");
		Reporter.log("Login Page is Dispalyed",true);
		
		
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		soft.assertEquals(driver.getTitle(), "Demo Web Shop", "Home Page is Not Displayed");
		Reporter.log("Home Page is Dispalyed",true);
		
		
		//if i dont use this method it will not throw the failures on the console screen
		soft.assertAll();
		
		Thread.sleep(4000);
		driver.close();
		
		
		
	}

}
