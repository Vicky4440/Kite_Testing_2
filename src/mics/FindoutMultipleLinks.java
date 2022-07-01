package mics;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindoutMultipleLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\sell jars\\chromedriver_win32 (1)//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		driver.findElement(By.linkText("Sign up for Facebook")).click();
		Thread.sleep(400);
		
		List<WebElement> op = driver.findElements(By.tagName("a"));

	System.out.println(	op.size());
	
    Iterator<WebElement> vp=op.iterator();
	while(vp.hasNext()) {
		System.out.println(vp.next().getText());
	}
	}

}
