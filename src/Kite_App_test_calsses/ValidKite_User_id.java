package Kite_App_test_calsses;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kite_App_Utility.Utility_Class;
import kite_App_Utility.Utility_using_properties;
import kite_App_pom.Kite_Home_Page;
import kite_App_pom.Kite_login_Page;
import kite_App_pom.Kite_logout_page;
import kite_App_pom.Kite_pin_page;
import kite_app_baseclass.Base_Class;

public class ValidKite_User_id extends Base_Class {
	Kite_login_Page login;
	Kite_login_Page userid;
	Kite_login_Page password;
	Kite_pin_page pin;
	Kite_Home_Page home;
	Kite_logout_page logout;
protected	WebDriver driver;
	
	
	
	
	@BeforeClass
	public void launchBrowser() {openbrowser();
		login=new Kite_login_Page(driver);
		pin = new Kite_pin_page(driver);
		logout=new Kite_logout_page(driver);
		home=new Kite_Home_Page(driver);
		
	}
	@BeforeMethod
	public void loginINTOkitepage() throws EncryptedDocumentException, IOException, InterruptedException {
		login.sendUserName(Utility_Class.readdatafromExcel(0, 0));
		password.sendPassword(Utility_Class.readdatafromExcel(0, 1));
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		pin.sendpin(Utility_Class.readdatafromExcel(0, 2));
		Thread.sleep(1000);
		
	}
	@Test
  public void validateuserID() throws EncryptedDocumentException, IOException {
		String USERID = home.getActulUserID();
		String expectedresult= Utility_Class.readdatafromExcel(0, 0);
		Assert.assertEquals(USERID, expectedresult,"test case is fail");
		Reporter.log("result is match, test case is ok", true);
		
		Utility_using_properties.screenshot(driver);
		 }
	@AfterMethod
	public void logoff() {
		logout.logout();
		Reporter.log("logout successfully", true);}
		
		@AfterClass
		public void closebrowser() {
			
		}
		
		
	
}
