package WeblelementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendkeyClickkeyEnabelkey {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\sell jars\\chromedriver_win32 (1)//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://auth.discoveryplus.in/login?flow=OTPLogin");
		
		Thread.sleep(5000);
		
		WebElement otpbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		    
		
		
      boolean result = otpbutton.isEnabled();
		
		
		System.out.println(result);
		
		driver.findElement(By.id("mobileNumber")).sendKeys("7057907270");
		Thread.sleep(5000);
		
	      boolean result1 = otpbutton.isEnabled();
		
		
		System.out.println(result1);
		
		
	}

}
