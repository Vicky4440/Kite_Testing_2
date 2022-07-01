package testng;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class_2 {
	@Test
	public void method3() {
		Reporter.log("Method 3 is running", true);
	}
	@Test
	public void method4() {
		Reporter.log("Method 4 is running", true);
	}
	@BeforeMethod
	public void login() {
		Reporter.log("Before the method is running", true);
	}
	
  
  }

