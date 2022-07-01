package testNG_Listener;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Pune {
  @Test
  public void pimpari() {
	  Reporter.log(" pimpari tc is runing", true);
  }
  @Test
  public void chikhli() {
	  Reporter.log(" chikhli tc is runing", true);
  }
  @Test
  public void bhosri() {
	  Reporter.log(" bhosri tc is runing", true);
  }
  @Test
  public void chakhan() {
	  Reporter.log(" chakhan tc is runing", true);
  }
}
