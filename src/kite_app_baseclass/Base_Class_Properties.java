package kite_app_baseclass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import kite_App_Utility.Utility_using_properties;

public class Base_Class_Properties {
	//  WebDriver driver;
	//using listener call static webdriver
	static WebDriver driver;
	
	
	
	
	
	public  void lunch() throws IOException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\sell jars\\chromedriver_win32 (2)//chromedriver.exe");
		
		
 driver=new ChromeDriver();
		 driver.get(Utility_using_properties.Getdatafromproperties("URL"));
			
			driver.manage().window().maximize();
			Reporter.log("browser launch", true);
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}

}
