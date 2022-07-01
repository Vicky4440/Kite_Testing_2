package Angel_Broking;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_ID {//V158873

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\sell jars\\chromedriver_win32 (2)//chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://trade.angelbroking.com/login/");
		Thread.sleep(1000);
		
		
		
		WebElement username = driver.findElement(By.id("txtUserID"));
		WebElement password = driver.findElement(By.id("txtTradingPassword"));
		
		WebElement loginbutton = driver.findElement(By.id("loginBtn"));
		
		username.sendKeys("V158873");
		password.sendKeys("Vikram@1998");
		loginbutton.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		
		
		WebElement expected = driver.findElement(By.xpath("/html/body/header/div[2]/div/div[2]/ul[2]/li[4]/a"));
		String expected1 = expected.getText();
		String actual= "V158873";
		
		
//		
	if(expected1.equals(actual)) {
			System.out.println("user id match with tc");
		}
	else {
			System.out.println("user id is not match test case failed");
			
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		expected.click();
		 driver.findElement(By.id("ub_logout")).click();
		
		
		
		
	}

}
