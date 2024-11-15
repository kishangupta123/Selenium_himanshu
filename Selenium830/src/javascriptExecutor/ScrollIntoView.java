package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrollIntoView {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(45));
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement latestCourses = driver.findElement(By.xpath("//h3[text()='Latest Courses']"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(4000);
		js.executeScript("arguments[0].scrollIntoView(true)",latestCourses);
	}

}
