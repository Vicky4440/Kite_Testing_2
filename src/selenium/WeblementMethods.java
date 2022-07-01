package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class WeblementMethods {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\sell jars\\chromedriver_win32 (1)//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/");
		Thread.sleep(500);
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String vikram = RandomString.make(2);
		File location=new File("C:\\Users\\dell\\Desktop\\sell jars\\Screenshot"+vikram+".png");
		FileHandler.copy(source, location);
	}

}
