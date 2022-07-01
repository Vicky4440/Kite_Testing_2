package testNG_Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener {
	//
	
	//ontestpass
	//ontestfail
	//ontestskip
	//ontestsucess
	
	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("TC is sucess",true);
		ITestListener.super.onTestSuccess(result);
		Reporter.log("Success TC name is "+result.getName(),true);
		}
	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log("tc fail take a screenshot", true);
		ITestListener.super.onTestFailure(result);
		Reporter.log("TC is fail "+result.getName(),true);}


}
