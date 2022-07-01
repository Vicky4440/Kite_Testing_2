package sychroniztionMethid;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\sell jars\\chromedriver_win32 (1)//chromedriver.exe");
		
		
		
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		         WebDriverWait w = new WebDriverWait(driver,Duration.ofMillis(1000));
		   WebElement    op = driver.findElement(By.xpath("(//a[contains(@id,'u_0_2')])"));
		   w.until(ExpectedConditions.visibilityOf(op));
		   op.click();
		

	}

}
