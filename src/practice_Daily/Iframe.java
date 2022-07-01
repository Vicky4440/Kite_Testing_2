package practice_Daily;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\sell jars\\chromedriver_win32 (2)//chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
				
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		driver.switchTo().frame("//iframe[@id='rufous-sandbox']");
		
		
	}

}
