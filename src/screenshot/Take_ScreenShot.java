package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Take_ScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\sell jars\\chromedriver_win32 (3)//chromedriver.exe");
		
		
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
         File op = ((RemoteWebDriver)driver).getScreenshotAs(OutputType.FILE);
         File dest= new File("C:\\Users\\dell\\Desktop\\sell jars\\Screenshot.png");
 		FileHandler.copy(op, dest);
	}

}
