package Assignment.popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Naukri {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		WebElement resumeButton = driver.findElement(By.xpath("//h2[text()=\"I'm experienced\"]"));
		resumeButton.click();
		WebElement resume = driver.findElement(By.id("resumeUpload"));
		Actions act=new Actions(driver);
		act.scrollToElement(resume);
		resume.sendKeys("E:\\DOCUMENTS\\FOLDER\\Himanshu Resume.pdf");
	}

}
