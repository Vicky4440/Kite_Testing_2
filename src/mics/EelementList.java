package mics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EelementList {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method 

System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\sell jars\\chromedriver_win32 (2)//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
	    Thread.sleep(1000);
		
          driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("dell i5 laptop");
          driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
          driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button")).click();
          
          driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
          
      WebElement reviews = driver.findElement(By.xpath("((//div[@class='_3pLy-c row'])[1]//span)[6]"));
      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
          System.out.println(reviews.getText());
          
	}

}
