package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample {
	@Test
	public void sample()
	{
		Reporter.log("Welcome To Advance Selenium",true);
	}
	@Test
	public void demo()
	{
		Reporter.log("Demo Test case executed",true);
	}
	@Test
	public void add()
	{
		Reporter.log("Add Method is executed",true);
	}
}
