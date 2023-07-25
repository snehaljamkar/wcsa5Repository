package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomeListener extends BaseTest implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("test started", true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("test executed succesfully", true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		Reporter.log("This method is failed and taken the screenshot :"+methodName, true);
		failedMethod(methodName);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("test skipped", true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("test actual started", true);
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("test finished",true);
	}

}
