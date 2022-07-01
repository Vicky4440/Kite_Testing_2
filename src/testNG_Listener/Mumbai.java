package testNG_Listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Mumbai {
  @Test
  public void bandra() {
	  Reporter.log("bandra tc is runing", true);
  }
  @Test
  public void navimumbai() {
	  Reporter.log("navimubai tc is runing", true);
	  
  }
  @Test
  public void thane() {
	  Assert.fail();
	  Reporter.log("thane tc is runing", true);
  }
}
