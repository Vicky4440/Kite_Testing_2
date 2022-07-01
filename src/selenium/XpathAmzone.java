package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAmzone {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\sell jars\\chromedriver_win32 (1)//chromedriver.exe");
		
		
		
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://accounts.snapchat.com/accounts/login?client_id=geo");
		driver.manage().window().maximize();
		Thread.sleep(100);
		
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Sagar");
		Thread.sleep(100);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456789");
		Thread.sleep(100);
		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
