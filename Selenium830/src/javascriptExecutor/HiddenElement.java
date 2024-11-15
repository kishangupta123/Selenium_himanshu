package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HiddenElement {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(45));
		
		driver.get("https://www.facebook.com/reg");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement gendertTf = driver.findElement(By.id("custom_gender"));
		js.executeScript("arguments[0].value='have a good day!!!'",gendertTf);
		js.executeScript("arguments[0].value='himanshu!!!'",gendertTf);
	}

}
