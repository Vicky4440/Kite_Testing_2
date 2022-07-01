package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Invocation_count {
  @Test(invocationCount = 4)
 
  public void Method1() {
	  Reporter.log("Method 1 is running");
  }
  
  @AfterMethod
  public void closebrowser() {
	  Reporter.log("window close");
  }
}
