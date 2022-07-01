package mics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\sell jars\\chromedriver_win32 (1)//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		//move to element using mouse actions
		Actions act= new Actions(driver);
		          WebElement op = driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
                 act.moveToElement(op).perform();
                 // using mouse action
                 
                 
              WebElement sp = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[2]"));
                 //1 st way
            //  act.moveToElement(sp).perform();
           //  act.moveToElement(sp)  .click().perform(); 
              
              //2nd way
            //act.moveToElement(testElement).click().build().perform();
              
              
              //right click-contest click
              act.moveToElement(sp).contextClick().build().perform();
              
              //drag action
              
                 
	}

}
