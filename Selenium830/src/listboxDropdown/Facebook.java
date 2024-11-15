package listboxDropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		driver.get("https://www.facebook.com/reg");
		WebElement monthDropDown = driver.findElement(By.id("month"));
		Select monthSelect=new Select(monthDropDown);
		List<WebElement> allOptions = monthSelect.getOptions();
		for(int i=0;i<12;i++)
		{
			monthSelect.selectByIndex(i);
			System.out.println(allOptions.get(i).getText());
			
			
		
		}
		
		
		
		driver.close();
		
				
	}

}
