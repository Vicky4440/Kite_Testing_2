package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

import dev.failsafe.Timeout;

public class Time_out_Key_Word {
  @Test
  public void method1() {
	  Reporter.log("method 1 is running ", true);
  }
  @Test(timeOut = 100)
  public void method2() throws InterruptedException {
	  Thread.sleep(2000);
	  Reporter.log("method 2 is running", true);
	
  }
  @Test 
  public void method3() {
	  Reporter.log("method 3 is running", true);
  }
}
