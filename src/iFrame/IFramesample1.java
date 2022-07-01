package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFramesample1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\sell jars\\chromedriver_win32 (1)//chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		 driver.switchTo().frame("frame1");
		
		Thread.sleep(1000);
		WebElement Frame2 = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		
		
		driver.switchTo().frame(Frame2);
		Thread.sleep(1000);
		
		WebElement text = driver.findElement(By.xpath("//p[text()='Child Iframe']"));
		Thread.sleep(1000);
		
		System.out.println(text.getText());
		Thread.sleep(1000);
		
		driver.switchTo().parentFrame();
		
		 WebElement text1 = driver.findElement(By.xpath("//body[text()='Parent frame']"));
		 Thread.sleep(1000);
		 System.out.println(text1.getText());
		 
		driver.switchTo().defaultContent(); 
		Thread.sleep(1000);
		WebElement text2 = driver.findElement(By.xpath("//div[contains(text(),'Sample Nested Iframe page')]"));
		Thread.sleep(1000);
		System.out.println(text2.getText());
		Thread.sleep(1000);
	}

}
