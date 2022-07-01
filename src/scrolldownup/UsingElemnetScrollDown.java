package scrolldownup;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingElemnetScrollDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\sell jars\\chromedriver_win32 (1)//chromedriver.exe");
		
		
		
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
         JavascriptExecutor J = ((JavascriptExecutor)driver);
           WebElement op = driver.findElement(By.xpath("//a[text()='Careers']"));
           
           J.executeScript("arguments[0].scrollIntoView(true);",op);
           Thread.sleep(1000);
           op.click();
           Thread.sleep(100);
	}

}
