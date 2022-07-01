package Firefox_Driver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dynamic_Table_Handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dell\\Desktop\\sell jars\\geckodriver-v0.31.0-win64\\geckodriver.exe");
        WebDriver    driver= new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
        
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        
        
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Nokia Mobile");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        
      List<WebElement> list = driver.findElements(By.xpath("(//ul[@role='listbox'])[2]"));
      
      for(WebElement op:list) {
    	  System.out.println(op.getText());
    	  
      }
      String expectedResult="nokia mobile 4g";
      
      for(WebElement vp:list) {
    	  String acualresult=vp.getText();
 	  if(acualresult.equals(expectedResult)) {
    		  vp.click(); 
    		  break;
  	  }
    	  
    	  
      }
    		  
	}

}
