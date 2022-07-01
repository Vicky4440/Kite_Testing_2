package Kite_App_test_calsses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kite_App_Utility.Utility_using_properties;
import kite_App_pom.Kite_Home_Page;
import kite_App_pom.Kite_login_Page;
import kite_App_pom.Kite_logout_page;
import kite_App_pom.Kite_pin_page;
import kite_app_baseclass.Base_Class_Properties;

public class Validate_userid_properties {
	
	Kite_login_Page login;
	Kite_pin_page pin;
	Kite_logout_page logout;
	static WebDriver driver;
	Kite_Home_Page home;
	@BeforeClass
	public void launchbrowser() throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\sell jars\\chromedriver_win32 (2)//chromedriver.exe");
		
		
		 driver=new ChromeDriver();
				 driver.get(Utility_using_properties.Getdatafromproperties("URL"));
					
					driver.manage().window().maximize();
					Reporter.log("browser launch", true);
					driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
					login= new Kite_login_Page(driver);
					pin=new Kite_pin_page(driver);
					logout=new Kite_logout_page(driver);
				
					
	}
	@BeforeMethod
	public void beforelogin() throws IOException, InterruptedException {
		login.sendUserName(Utility_using_properties.Getdatafromproperties("UN"));
		login.sendPassword(Utility_using_properties.Getdatafromproperties("PWD"));
		login.clickOnLoginButton();
		
		Utility_using_properties.StaticWait(driver, 1000);
		pin.sendpin(Utility_using_properties.Getdatafromproperties("PIN"));
		pin.click();
		Thread.sleep(1000);
	}
	 @Test
 public void validateusername() throws IOException {
		 String USERID = home.getActulUserID();
		String expectedresult= Utility_using_properties.Getdatafromproperties("UN");
		Assert.assertEquals(USERID, expectedresult,"test case is fail");
		Reporter.log("result is match, test case is ok", true);
						Utility_using_properties.screenshot(driver);
  }
	 @AfterMethod
	 public void logoutfromkite() {
		 logout.clik();
		 logout.logout();
	 }
	 @AfterClass
	 public void closebrowser() throws InterruptedException {
		 Thread.sleep(200);
		 driver.close();
	 }
}
