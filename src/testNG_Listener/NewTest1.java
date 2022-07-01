package testNG_Listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(testNG_Listener.Listener.class)
public class NewTest1 {
 @Test
  public void mymethod() {
	 Assert.fail();
	  Reporter.log("test case is pass", true);
  }
}
