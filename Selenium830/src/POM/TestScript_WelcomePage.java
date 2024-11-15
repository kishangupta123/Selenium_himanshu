package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript_WelcomePage {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		
		driver.get("https://demowebshop.tricentis.com/");
		WelcomePage_Tricentis wp=new WelcomePage_Tricentis(driver);
		wp.getLoginLink().click();
		
		LoginPage_Tricentis lp=new LoginPage_Tricentis(driver);
		lp.getEmailTf().sendKeys("abhis1234@gmail.com");
		lp.getPasswordTf().sendKeys("abhis@1234");
		lp.getLoginButton().click();
	}

}
