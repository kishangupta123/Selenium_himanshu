package TestNG.Cars;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MiniCooper {
	@Test(groups = "smoke")
	public void launch()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://mini.in/en_IN/home/range/mini-cooper-3-door.html");
		Reporter.log("Mini Cooper Launched SuccessFully",true);
		driver.close();
	}

}
