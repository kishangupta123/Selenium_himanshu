package Popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandleConfirmationPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
		Alert popupAlert = driver.switchTo().alert();
		System.out.println(popupAlert.getText());
		
		popupAlert.accept();
		Thread.sleep(4000);
		System.out.println(popupAlert.getText());
		popupAlert.accept();
		
		Thread.sleep(3000);
		driver.close();
	}

}
