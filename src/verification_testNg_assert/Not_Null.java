package verification_testNg_assert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Not_Null {
  @Test
  public void method() {
	  String s=null;
	  String m="hi";
	  

	 
	  Assert.assertNull(s, "value is not Null TC failed");
	  Reporter.log("value is null TC is passed",true);
  }
}
