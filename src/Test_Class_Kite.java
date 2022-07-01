

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Firefox_Driver.Pom_Class_Kite;

public class Test_Class_Kite {
	static Pom_Class_Kite loginclass;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\sell jars\\chromedriver_win32 (2)//chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		 driver.get("https://kite.zerodha.com/");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			
		
			loginclass=new Pom_Class_Kite(driver);
		
	
	loginclass.sendun("ELR");
	loginclass.sendpwd("Dhana1111");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
		
		
		
		
		
		
		
	}


