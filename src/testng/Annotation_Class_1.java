package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation_Class_1 {
	
	@Test
	public void method1() {
		Reporter.log("Method 1 is running", true);
	}
	@Test
	public void method2() {
		Reporter.log("Method 2 is running", true);
	}
	@BeforeMethod
	public void login() {
		Reporter.log("Before the method is running", true);
	}
	
	@AfterMethod
	public void logout() {
		Reporter.log("After the method is running", true);
	}
	@BeforeClass
	public void browserlunch() {
		Reporter.log("before class is running", true);
	}
   @AfterClass
   public void closebrowser() {
	   Reporter.log("after class is running", true);
   }
}
