package Assignment.popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WoodenStreet {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
		
		
		//Website to Visit For the AssignMent
		driver.get("https://www.woodenstreet.com/");
		popBlocker(driver);
		
		
		//By Entering this Web ELement I am Able To Click On the Sofas Button
		WebElement sofaSet = driver.findElement(By.partialLinkText("Sofas"));
		sofaSet.click();
		
		
		//
		driver.findElement(By.xpath("(//p[text()='Fabric Sofas'])[1]")).click();
		
		
		addProductToCart(driver);
		
		driver.findElement(By.xpath("//a[@title='Cart']")).click();
		List<WebElement> sofaPrice = driver.findElements(By.tagName("strong"));
		System.out.println(sofaPrice.size());
	
		
		
		TreeSet<Integer> priceSet=new TreeSet<>();
		for(WebElement ele:sofaPrice)
		{
			try {
				String actualPrice = ele.getText().replace(",", "").replaceAll("Rs ", "");
				int price=Integer.parseInt(actualPrice);
				priceSet.add(price);
			}
			catch (Exception e) {
			}
		}
		System.out.println(priceSet);
		
//		
//		ArrayList al=new ArrayList();
//		for(WebElement el:sofaPrice)
//		{
//			String pr = el.getText().replace(",", "").replaceAll("Rs ", "");
//	//		int priceTag=Integer.parseInt(pr);
//			al.add(pr);
//		}
//		Collections.sort(al);
//		System.out.println(al.getLast());
		
		
		Thread.sleep(9000);
		
		driver.close();
	}
	public static void popBlocker(WebDriver driver)
	{
		
		try {
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(45));
			WebElement popup = driver.findElement(By.id("loginclose1"));
			wait.until(ExpectedConditions.elementToBeClickable(popup));
			popup.click();
		}
		catch (Exception e) {
		}
	}
	public static void addProductToCart(WebDriver driver)
	{
		try
		{

			
			driver.findElement(By.xpath("//h3[text()='Henry 3 Seater Sofa (Velvet, Chestnut Brown)']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@id='button-cart-buy-now']")).click();
			
			driver.findElement(By.xpath("(//p[text()='Berlin 3 Seater Sofa (Velvet, Indigo Blue) '])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@id='button-cart-buy-now']")).click();
			driver.findElement(By.xpath("(//p[text()='Parker 3 Seater Sofa (Cotton, Cream Robins) '])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@id='button-cart-buy-now']")).click();
		}
		catch (Exception e) {
		}
		
		
	}

}
