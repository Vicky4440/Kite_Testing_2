package framework;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\sell jars\\chromedriver_win32 (2)//chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/?stype=lo&jlou=AffN3sN_tfT_a30VfMPLENETZY8cSpFMo0LnPZuZOk7s1P8OWPFf82QJ6rvoXTQaTqIDKCxizSua_ZDtu6CQMzq1I8UK2oJNbprLySPy96WYxg&smuh=40109&lh=Ac89YYWSkMPa3EdXQLY");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		
		
		//create ob of class
		
		FB_Login_page fb= new FB_Login_page(driver);
		fb.usrename(null);
		fb.password();
		fb.clickbutton();
	}

}
