package kite_withxl;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass_usingTestNG {
	Test_Page_withXL home;
	Login_page_with_Xl login;
	Login_page_with_Xl password;
	pin_with_Xl pin;
	WebDriver driver;
	Logout_page logout;
	Sheet mysheet;
	
	@BeforeClass
	public void launchbrowser() throws EncryptedDocumentException, IOException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\sell jars\\chromedriver_win32 (2)//chromedriver.exe");
		
		
		 driver=new ChromeDriver();
		 driver.get("https://kite.zerodha.com/");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			pin= new pin_with_Xl(driver);
		login=new Login_page_with_Xl(driver);
		password=new Login_page_with_Xl(driver);
	
		logout=new Logout_page(driver);
File filenew= new File("C:\\Users\\dell\\Desktop\\sell jars//vikram.xlsx");
		
		
		mysheet = WorkbookFactory.create(filenew).getSheet("Sheet4");
		
	}
  @BeforeMethod
  public void kitepageapp() {driver.manage().timeouts().implicitlyWait(Duration.ofMillis(200));
	  login.sendUserName(mysheet.getRow(0).getCell(0).getStringCellValue());
	  Reporter.log("sending username", true);
		password.sendPassword(mysheet.getRow(0).getCell(1).getStringCellValue());
		Reporter.log("sending password", true);
		login.clickOnLoginButton();
		Reporter.log("click on login button", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(200));
pin.sendpin(mysheet.getRow(0).getCell(2).getStringCellValue());
Reporter.log("sending pin", true);
pin.click();

	}
  @Test
  public void verifyuserid() {String expectedUserID = mysheet.getRow(0).getCell(0).getStringCellValue();
  String actualUserID = login.getActulUserID();
 
  Assert.assertEquals(expectedUserID, actualUserID, "expected or actual userid not match tc fail");
 
  Reporter.log("Expected UserID and Actual UserID are matching TC is PASSED",
  true);
	  
  }
  
  @AfterMethod
  public void kitelogout() {
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(200));
	  logout.clik();
	  logout.logout();
	  Reporter.log("logout successfully", true);
  }
  @AfterClass
  public void closebrowser() {
	  driver.close();
	  Reporter.log("close browser", true);
	  
  }
}
