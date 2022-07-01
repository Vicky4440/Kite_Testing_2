package verification_testNg_assert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Equlas_NotEquals {
  @Test
  public void method() {
	  
	  String s="Vikram";
	  String m="Vikram";
	  String n="Pune";
	  // if s and are same then TC should be passed else TC failed
	  
	 // Assert.assertEquals(m, s,"Strings are not Matching TC is failed");
	 // Reporter.log("Strings are matching TC is Passed", true);
	  
	  Assert.assertNotEquals(m, s,"Strings are matching TC is failed");
	  Reporter.log("Strings is  matching TC is PASSED", true);
  }
}
