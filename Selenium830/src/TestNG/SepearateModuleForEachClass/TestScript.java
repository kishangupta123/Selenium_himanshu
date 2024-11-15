package TestNG.SepearateModuleForEachClass;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript extends BaseClass
{
	@Test
	public void clickOnBooks()
	{
		driver.findElement(By.partialLinkText("BOOKS")).click();
		String actualTitle = driver.getTitle();
		String expectedTitle = workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		if(actualTitle.equals(expectedTitle))
		{
			Reporter.log("Books Page is Displayed", true);
		}
		else
		{
			Reporter.log("Book Page Is not Displayed",true);
		}
		
	}

}
