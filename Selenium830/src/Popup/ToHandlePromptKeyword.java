package Popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandlePromptKeyword {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
		//Url Of The Website
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		//WebElement is Inside This iframe So We Switch inside The iFrame
		driver.switchTo().frame("iframeResult");
		
		//Here We Will Try To Click On the Webelement
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		//Create Refrence for the Alert Class
		Alert scriptPopup = driver.switchTo().alert();
		
		//It Will Capture the Text On the Alert Popup
		String popMsg = scriptPopup.getText();
		System.out.println(popMsg);
		
		//JAvaScript Popup Take Input from the user so here input will be given
		scriptPopup.sendKeys("Selenium");
		//To Handle the Alert We Will perform this alert actions
		scriptPopup.accept();
		
		Thread.sleep(3000);
		driver.close();
	}

}
