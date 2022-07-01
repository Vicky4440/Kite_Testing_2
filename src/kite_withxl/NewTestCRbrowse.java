package kite_withxl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTestCRbrowse {
	
	@Parameters("browser")
  @BeforeClass
  
  public void launchbrowser(String browser) {
		if(browser.equals("chrome")) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\sell jars\\chromedriver_win32 (2)//chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		 driver.get("https://kite.zerodha.com/");
			
			driver.manage().window().maximize();}
		else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\dell\\Desktop\\sell jars\\geckodriver-v0.31.0-win64\\geckodriver.exe");
          WebDriver    driver= new FirefoxDriver();
          driver.get("https://kite.zerodha.com/");
			
			driver.manage().window().maximize();
		}
		
  }
}
