package TestNG.Cars;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class lamborghini {
	@Test(groups = "system")
	public void launch()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(55));
		
		driver.get("https://www.lamborghini.com/en-en");
		Reporter.log("Lamborghini Launched SuccessFully",true);
		driver.close();
	}
	

}
