package Firefox_Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scrolling_ {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dell\\Desktop\\sell jars\\geckodriver-v0.31.0-win64\\geckodriver.exe");
        WebDriver    driver= new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		JavascriptExecutor j=((JavascriptExecutor)driver);
		j.executeScript("window.scrollBy(800,1000)");
		
		Thread.sleep(2000);
		
		//sroll into view
		WebElement vp = driver.findElement(By.xpath("//a[@class='icp-button']"));
		
		j.executeScript("arguments[0].scrollIntoView(true);",vp);

	}    

}
