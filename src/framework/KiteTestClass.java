package framework;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteTestClass {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\sell jars\\chromedriver_win32 (2)//chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		
		
		
		
driver.get("https://kite.zerodha.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		//calling login page class
		KiteLoginPage k=new KiteLoginPage(driver);
		k.sendUserName();
		k.sendPassword();
		k.clickOnLoginButton();
		
		
		//pinclick class
		
		Pinclick p=new Pinclick(driver);
		p.sendpin();
		p.click();
		
		
		
		// TODO Auto-generated method stub

	}

}
