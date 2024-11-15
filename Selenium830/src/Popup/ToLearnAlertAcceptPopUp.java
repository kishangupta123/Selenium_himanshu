package Popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnAlertAcceptPopUp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		
		Alert alertPopup = driver.switchTo().alert();
		Thread.sleep(3000);
		String popUpMsg = alertPopup.getText();
		System.out.println(popUpMsg);

		//We can use either accept or dismiss to handle  Alert popup
		//alertPopup.accept();
		alertPopup.dismiss();
		
		Thread.sleep(6000);
		driver.quit();
		
		//If We Tru To Get PopMSg or if we perform any alrt actions without clicking on the
		//element it will throw 
		
		
	}

}
