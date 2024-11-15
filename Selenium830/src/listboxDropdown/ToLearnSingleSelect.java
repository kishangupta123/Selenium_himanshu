package listboxDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnSingleSelect {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(555));
		driver.get("https://www.facebook.com/reg/?next=%2FnopCommerce");
		WebElement dayDropDown = driver.findElement(By.id("day"));
		Select daySelect=new Select(dayDropDown);
		daySelect.selectByValue("21");
		Thread.sleep(2000);
		WebElement monthDropDown = driver.findElement(By.id("month"));
		Select monthSelect=new Select(monthDropDown);
		monthSelect.selectByIndex(4);
		Thread.sleep(3000);
//		monthSelect.selectByValue("5");
//		monthSelect.selectByVisibleText("May");
		WebElement yearDropdown = driver.findElement(By.id("year"));
		System.out.println(yearDropdown.getSize());
		Select yearselectSelect=new Select(yearDropdown);
		yearselectSelect.selectByValue("1994");
		Thread.sleep(5000);
		driver.close();
		
	}

}
