package Angel_Broking;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Zerodha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\sell jars\\chromedriver_win32 (2)//chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		
		
		
		
driver.get("https://kite.zerodha.com/");
		
		driver.manage().window().maximize();
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofMillis(5000));
		
		WebElement myid = driver.findElement(By.id("userid"));
		
		w.until(ExpectedConditions.visibilityOf(myid));
		
		myid.sendKeys("ELR321");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Dhana1111");
		
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		driver.findElement(By.id("pin")).sendKeys("982278");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		WebElement expected = driver.findElement(By.xpath("//span[text()='ELR321']"));

		String expected1 = expected.getText();
		String actual = "ELR321";
		
		if(expected1.equals(actual))
		{
			System.out.println("test case pass");
		}
		else
		{
			System.out.println("test case fail");
		}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
