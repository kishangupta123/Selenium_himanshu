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

public class JavaconditionsHardAssert {
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
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop", "Welcome Page is Not Displayed");
		Reporter.log("Welcome Page is Dispalyed");
		
		driver.findElement(By.linkText("Log in")).click();
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Login", "Login Page is Not Displayed");
		Reporter.log("Login Page Is Displayed");
		
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop", "Home Page is Not Displayed");
		Reporter.log("Home Page Is Not Displayed",true);
		
		Thread.sleep(4000);
		driver.close();
		
	}

}
