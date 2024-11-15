import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dream11UsingXpath {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://www.dream11.com/");
		WebElement frameExample = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
		driver.switchTo().frame(frameExample);
		driver.findElement(By.id("regEmail")).sendKeys("9918575879");
		driver.findElement(By.id("regUser")).click();
		
		//these 2 methods are to switch back to original fram either 1 can be used
		//driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		
		
		driver.findElement(By.id("hamburger")).click();
	}

}
