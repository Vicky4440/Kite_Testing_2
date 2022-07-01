package parallel_serial_excuation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test
 public void method1() {
	  
	  
	  System.setProperty("webdriver.chrome.driver",  "C:\\Users\\dell\\Desktop\\sell jars\\chromedriver_win32 (2)//chromedriver.exe");
		
			  
			  WebDriver driver= new ChromeDriver();
			  driver.manage().window().maximize();
			  driver.get("https://kite.zerodha.com/");
			  Reporter.log("myMethod1 is running", true);
  }
}
