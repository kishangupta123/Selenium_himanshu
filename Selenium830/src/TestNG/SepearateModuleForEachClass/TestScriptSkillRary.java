package TestNG.SepearateModuleForEachClass;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class TestScriptSkillRary extends BaseClassDemoWebSkilliary{
	@Test
	public void clickOnSales() throws InterruptedException
	{
		driver.findElement(By.linkText("Sales")).click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(),"SkillRary Ecommerce", "Sales Page Not Displayed");
		Reporter.log("Sales History Page Is Displayed",true);
	}
	

}
