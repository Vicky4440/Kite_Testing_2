package scrolldownup;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleScrollDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\sell jars\\chromedriver_win32 (1)//chromedriver.exe");
		
		
		
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		JavascriptExecutor J = ((JavascriptExecutor)driver);
		//just scroll down and up
		
		J.executeScript("window.scrollBy(80,900)");
		Thread.sleep(1000);
		
		
		
	}

}
