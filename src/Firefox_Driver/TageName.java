package Firefox_Driver;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TageName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dell\\Desktop\\sell jars\\geckodriver-v0.31.0-win64\\geckodriver.exe");
        WebDriver    driver= new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		
		
		List<WebElement> tagname = driver.findElements(By.tagName("a"));
		System.out.println(tagname.size());
		Iterator<WebElement> vp=tagname.iterator();
		while(vp.hasNext()) {
			System.out.println(vp.next().getText());
		}
	}

}
