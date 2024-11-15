package listeners.testNG.DemoWebShop;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerImplementation.class)
public class TestScript extends BaseClass {
	@Test(description = "Login And Verify")
	public void login()
	{
		Reporter.log("Pls Click on LOgin Link",true);
		driver.findElement(By.linkText("Log in")).click();
		
		Reporter.log("Pls Enter Valid Credential",true);
		driver.findElement(By.id("Email")).sendKeys("abhis1234@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("abhis@1234");
		
		Reporter.log("Click On Login Button",true);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop","Home Page is Not Display");
		Reporter.log("HOme Page Is Displayed",true);
	}

}
