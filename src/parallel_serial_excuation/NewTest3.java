package parallel_serial_excuation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest3 {
  @Test
  public void method3() {System.setProperty("webdriver.chrome.driver",  "C:\\Users\\dell\\Desktop\\sell jars\\chromedriver_win32 (2)//chromedriver.exe");
	
  
  WebDriver driver= new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://www.flipkart.com/");
  Reporter.log("myMethod3 is running", true);
  }
}
