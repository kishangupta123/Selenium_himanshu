package listboxDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnIsMultiple {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement priceListBox = driver.findElement(By.id("cars"));
		Select priceSelect=new Select(priceListBox);
		priceSelect.selectByIndex(0);
		priceSelect.deselectByValue("99");
		priceSelect.deselectByVisibleText("INR 100 - INR 199 ( 16 )");
		Thread.sleep(5000);
		priceSelect.deselectAll();
		System.out.println(priceSelect.isMultiple());
		Thread.sleep(4000);
		driver.close();
		
	}

}
