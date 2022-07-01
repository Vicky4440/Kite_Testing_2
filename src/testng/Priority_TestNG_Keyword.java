package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority_TestNG_Keyword {
  @Test(priority = 1)
  public void f() {
	  
	  Reporter.log("Method f is running", true);
  }
  @Test(enabled = false)
  public void a() {
	  Reporter.log("method a is runing", true);
  }
  @Test(priority = 0)
  public void d() {
	  Reporter.log("method d is running", true);
  }
}
