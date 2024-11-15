import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dream11 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		//in case o fthe dream 11 only if u dont use implicit wait then it will immidiately paaed the password
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(120));
		
		
		driver.get("https://www.dream11.com/");
		
		
		//This frame is based on the index value
		//driver.switchTo().frame(0); 
		driver.switchTo().frame("send-sms-iframe");
		driver.findElement(By.id("regEmail")).sendKeys("9777774723",Keys.ENTER);
	}

}
