package WeblelementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkmethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\sell jars\\chromedriver_win32 (1)//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		
		Thread.sleep(400);
		
		driver.findElement(By.linkText("Sign up for Facebook")).click();
		Thread.sleep(400);
		
		WebElement radiobutton = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		
		
		if(radiobutton.isSelected()) {
			System.out.println("radio button already selected");
		}
		else {
			System.out.println("Select radio button");
			radiobutton.click();
		}
		if(radiobutton.isSelected()) {
			System.out.println("radio button selected now");
			
		}
		else {System.out.println("Failed to select radio button");}
		
		
		
		
		
		
		
		
		
	}

}
