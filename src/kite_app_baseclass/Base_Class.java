package kite_app_baseclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Base_Class {
	WebDriver driver;
	
	
	
	
	
	
	public void openbrowser() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\sell jars\\chromedriver_win32 (2)//chromedriver.exe");
		
		
		 driver=new ChromeDriver();
		 driver.get("https://kite.zerodha.com/");
			
			driver.manage().window().maximize();
			Reporter.log("browser launch", true);
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}

}
