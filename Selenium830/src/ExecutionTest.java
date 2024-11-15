import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExecutionTest {
	public static void main(String[] args) throws IOException, InterruptedException {
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
				WebDriverWait
				wait=new WebDriverWait(driver, Duration.ofSeconds(45));
				
				driver.get("https://demo.vtiger.com/vtigercrm/");
//				takeScreenshot(driver);
			
				driver.findElement(By.partialLinkText("Visit Now")).click();
				
				String parentWindow = driver.getWindowHandle();
				 
				Set<String> allWindows = driver.getWindowHandles();
				
				for(String id:allWindows)
				{
					
					if(id!=parentWindow)
					{
						driver.switchTo().window(id);
					}
				}
				WebElement companyLink = driver.findElement(By.partialLinkText("Company"));
				Actions act=new Actions(driver);
				act.clickAndHold(companyLink).perform();
				driver.findElement(By.xpath("(//a[@href='/contact-us/'])[1]")).click();
				WebElement bng = driver.findElement(By.xpath("//div/..//p[contains(text(),'Benga')]/..//p[contains(text(),'+91')]"));
				act.scrollToElement(bng);
				System.out.println(bng.getText());
				Thread.sleep(3000);
				driver.quit();
				
			}public static void takeScreenshot(WebDriver driver) throws IOException
			 {
				String time = LocalDateTime.now().toString().replace(":", "-");
				TakesScreenshot ts=(TakesScreenshot) driver;
				File temp=ts.getScreenshotAs(OutputType.FILE);
				File dest=new File("./Screenshots/"+time+".png");
				org.openqa.selenium.io.FileHandler.copy(temp, dest);
				
			 }
			
	

		

}


