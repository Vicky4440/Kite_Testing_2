package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\sell jars\\chromedriver_win32 (1)//chromedriver.exe");
		
		
		// x path methods
		
		//face book 
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(100);
		
		//driver.findElement(By.xpath("//input[@name='inputEmail']")).sendKeys("Vikramn7@gmail.com");
		//Thread.sleep(100);
		//driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("1234789");
		//Thread.sleep(100);
		//driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();
		driver.findElement(By.xpath("(//input[@name='radio'])[2]")).click();
        
	}

}
