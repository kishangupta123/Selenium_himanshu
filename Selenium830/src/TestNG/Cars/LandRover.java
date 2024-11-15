package TestNG.Cars;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LandRover {
		@Test(groups = "regression")
		public void launch()
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			
			driver.get("https://www.landrover.in/index.html");
			Reporter.log("Land Rover Launched SuccessFully",true);
			driver.close();
		}

	}



