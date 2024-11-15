package TestNG.SepearateModuleForEachClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

public class BaseClassDemoWebSkilliary {
	public Properties prop;
	public WebDriver driver;
	@BeforeTest
	public void fechData() throws IOException
	{
		FileInputStream fis=new FileInputStream("./testData/skillraryData.properties");
		prop=new Properties();
		prop.load(fis);
		
	}
	@Parameters("Browser")
	@BeforeClass
	public void launchBrowser(String browsername)
	{
		String url = prop.getProperty("url");
		if(browsername.equals("chrome"))
		{
			driver=new ChromeDriver();
		}else if(browsername.equals("edge"))
		{
			driver=new EdgeDriver();
		}else if(browsername.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		driver.get(url);
		
		
	}
	@BeforeMethod
	public void login() throws InterruptedException
	{
		String username = prop.getProperty("Username");
		String password = prop.getProperty("Password");
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(3000);
	}
	@AfterMethod
	public void logout()
	{
		driver.findElement(By.linkText("SkillRary Admin")).click();
		driver.findElement(By.linkText("Sign out")).click();
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}

}
