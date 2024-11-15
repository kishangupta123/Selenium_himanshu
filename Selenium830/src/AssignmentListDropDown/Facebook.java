package AssignmentListDropDown;

import java.nio.channels.SelectableChannel;
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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		
		driver.get("https://www.facebook.com/reg");
		WebElement yearDropDown = driver.findElement(By.id("year"));
		Select yearSelect=new Select(yearDropDown);
		List<WebElement> yearOptions = yearSelect.getOptions();
		for(int i=1;i<=120;i++)
		{
			yearSelect.selectByIndex(i);
		}
		
		System.out.println("Last Year of the List is :"+yearOptions.getLast().getText());
		System.out.println("All Number Of Years :"+yearOptions.size());
		Thread.sleep(6000);
		driver.close();
	}

}
