package kite_withxl;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Page_withXL {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\sell jars\\chromedriver_win32 (2)//chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
File filenew= new File("C:\\Users\\dell\\Desktop\\sell jars//vikram.xlsx");
		
		
		Sheet sheet = WorkbookFactory.create(filenew).getSheet("Sheet4");
	String login = sheet.getRow(0).getCell(0).getStringCellValue();
	String password = sheet.getRow(0).getCell(1).getStringCellValue();
	  String pin = sheet.getRow(0).getCell(2).getStringCellValue();
		
		
		
driver.get("https://kite.zerodha.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		//calling login page class
		Login_page_with_Xl k=new Login_page_with_Xl(driver);
		
		k.sendUserName(login);
		k.sendPassword(password);
		k.clickOnLoginButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		//calling pin class
		 pin_with_Xl vp=new pin_with_Xl(driver);
		 vp.sendpin(pin);
		vp.click();
		//logout class
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		Logout_page pv=new Logout_page(driver);
		pv.clik();
		pv.logout();
	}

}
