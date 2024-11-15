package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Example {
	@BeforeSuite
	public void before() {
		Reporter.log("BS executed", true);
	}
	
	@BeforeClass
	public void before1() {
		Reporter.log("BC executed", true);
	}
	
	@BeforeTest
	public void before2() {
		Reporter.log("BT executed", true);
	}
	
	@AfterSuite
	public void after() {
		Reporter.log("AS executed", true);
	}
}
