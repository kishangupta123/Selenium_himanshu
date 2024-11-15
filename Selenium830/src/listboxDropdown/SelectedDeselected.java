package listboxDropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.sdk.metrics.internal.exemplar.AlwaysOffFilter;

public class SelectedDeselected {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement priceListBox = driver.findElement(By.id("cars"));
		Select priceSelect=new Select(priceListBox);
		priceSelect.selectByIndex(2);
		priceSelect.selectByIndex(0);
		priceSelect.selectByIndex(1);
		WebElement selectedOption = priceSelect.getFirstSelectedOption();
		System.out.println(selectedOption.getText());
		
		List<WebElement> allSelectedOption = priceSelect.getAllSelectedOptions();
		System.out.println(allSelectedOption.size());
		for(WebElement ele:allSelectedOption)
		{
			System.out.println(ele.getText());
		}
		Thread.sleep(6000);
		driver.close();
		
	}

}
