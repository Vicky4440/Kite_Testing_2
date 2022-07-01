package mics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlelist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\sell jars\\chromedriver_win32 (2)//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Nokia Mobile");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		List<WebElement> op = driver.findElements(By.xpath("//ul[@class='erkvQe']//li"));
		
		
		for(WebElement sp:op) {
			System.out.println(sp.getText());
		}
		String expected="nokia mobile 4g";
		
		for (WebElement vp:op) {
			String actualresult = vp.getText();
			if(actualresult.equals(expected)) {
				vp.click();
				break;
			}
			
		}
	}

}
