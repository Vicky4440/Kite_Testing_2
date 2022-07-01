package mics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableReading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\sell jars\\chromedriver_win32 (2)//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		
		List<WebElement> table = driver.findElements(By.xpath("(//table//tr)[21]"));
		  int totalnoofRows = table.size();
		  System.out.println("rows " +totalnoofRows);
		  
		  for(WebElement r:table) {
			  System.out.println("|| "+r.getText()+" ||");
		  }

	}

}
