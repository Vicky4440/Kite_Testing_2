import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\sell jars\\chromedriver_win32 (2)//chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		Actions op= new Actions(driver);
		//context click
		WebElement vp = driver.findElement(By.xpath("//a[text()='Payment Gateway Project']"));
		
		
		op.contextClick(vp).perform();
		//double click
		
		WebElement sp = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		op.doubleClick(sp).perform();
		
		
		//drag and move
		WebElement qp = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		op.dragAndDrop(qp, dest).build().perform();
		
		
		
	}

}
