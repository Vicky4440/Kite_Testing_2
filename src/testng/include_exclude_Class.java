package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class include_exclude_Class {
  @Test(priority = -1)
  
  public void method7() {
	  Reporter.log("Method 7 is running", true);
  }
  @Test(priority = -2)
  public void method8() {
	  Reporter.log("Method 8  is running", true);
  }
  @Test(priority = -3)
  public void method9() {
	  Reporter.log("Method 9 is running", true);
  }
  @Test
  public void method10() {
	  Reporter.log("Method 10 is running", true);
  }
  @Test
  public void method11() {
	  Reporter.log("Method 11 is running", true);
  }
  @Test
  public void method12() {
	  Reporter.log("Method 12 is running", true);
  }
}
