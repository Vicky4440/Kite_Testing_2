package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\sell jars\\chromedriver_win32 (1)//chromedriver.exe");
		
		
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
  Thread.sleep(100);
		driver.findElement(By.xpath("//a[contains(@id,'u_0_2')]")).click();
		Thread.sleep(1500);
		
		WebElement day = driver.findElement(By.name("birthday_day"));
		Select s=new Select(day);
		Thread.sleep(5000);
		
//		s.selectByIndex(10);
//		Thread.sleep(1000);
//		
	
		for(int i=0; i<=10;i++) {
			Thread.sleep(1500);
             s.selectByIndex(i);
		}
		
		
	}

}
