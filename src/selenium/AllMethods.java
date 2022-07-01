package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class AllMethods {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\sell jars\\chromedriver_win32 (1)//chromedriver.exe");
		
		
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(500);
		//input text value
		driver.findElement(By.xpath("(//a[contains(@id,'u_0_2')])")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[contains(@id,'u_2_b')]")).sendKeys("vikram");
		Thread.sleep(6000); 
		driver.findElement(By.xpath("//input[contains(@id,'u_2_d')]")).sendKeys("nalawade");
		Thread.sleep(6000);
        driver.findElement(By.xpath("//input[contains(@id,'u_2_g')]")).sendKeys("vikramnalawade12@gmail.com");
	    Thread.sleep(6000);
	    //renter email id
	    driver.findElement(By.xpath("//input[contains(@id,'u_2_j')]")).sendKeys("vikramnalawade12@gmail.com");
	    Thread.sleep(6000);
	    //enter new password
	    driver.findElement(By.id("password_step_input")).sendKeys("1234567890");
	    Thread.sleep(6000);
	    //select check box
	        WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		    Thread.sleep(6000);
           Select s=new Select(day);
	       s.selectByIndex(2);
	     Thread.sleep(7000);
		    //radio button
		    driver.findElement(By.xpath("//input[@value='2']")).click();
		    Thread.sleep(7000);
//		    if(op.isSelected()) {
//		    	System.out.println("radio button is already selected");}
//		    else {System.out.println("select the radio button");
//		    op.click();}
//		    if(op.isEnabled()) {System.out.println("radio button is selected");}
		    	  //screen shots
	      File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	      Thread.sleep(6000);
		    File desination=new File("C:\\Users\\dell\\Desktop\\sell jars\\Screenshot.png");
		    FileHandler.copy(source, desination);
	}
}
