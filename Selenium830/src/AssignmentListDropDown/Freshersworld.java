package AssignmentListDropDown;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Freshersworld {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		driver.get("https://www.freshersworld.com/");
		WebElement registerBtn = driver.findElement(By.xpath("//a/..//span[text()='REGISTER NOW']"));
		registerBtn.getText();
		if (registerBtn.getText().contains("REGISTER")) {
			System.out.println("Register Link Button Found");
		}
		registerBtn.click();
		

		WebElement currentCityDropDown = driver.findElement(By.id("currentCity"));
		Select citySelect = new Select(currentCityDropDown);
		citySelect.selectByVisibleText(" Bangalore ");
		
		WebElement courseDropDown = driver.findElement(By.id("course"));
		Select courseSelect = new Select(courseDropDown);
		courseSelect.selectByValue("16");
		//takeScreenhot(driver);
		Thread.sleep(6000);
		driver.close();
	}

	public static void takeScreenhot(WebDriver driver) throws IOException {
		String time = LocalDateTime.now().toString().replace(":", "-");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/" + time + ".png");
		FileHandler.copy(temp, dest);
	}

}
