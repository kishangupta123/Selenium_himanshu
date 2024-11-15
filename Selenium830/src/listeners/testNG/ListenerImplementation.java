package listeners.testNG;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerImplementation implements ITestListener {
	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Test Script is Failed",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test script is passed",true);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("Test Script Is Skipped",true);
	}
	

}
