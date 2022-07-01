package popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\sell jars\\chromedriver_win32 (1)//chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://skpatro.github.io/demo/links/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
	driver.manage().window().maximize();
	
    Set<String> s1 = driver.getWindowHandles();	
	Thread.sleep(3000);

	//all ids are received in set
	//set need to convert into ArrayList
    ArrayList<String> s2 = new ArrayList<>(s1);
    
    for(int i=0;i<=s2.size()-1;i++)
    {
    	System.out.println(s2.get(i));
    }
    
    String mainpage=s2.get(0);
    String childpage=s2.get(1);
    
  //here selenium focus switched to child page
    driver.switchTo().window(childpage);
    Thread.sleep(3000);
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//span[text()='Home']")).click();
	 Thread.sleep(3000);
	 driver.switchTo().window(mainpage);
	 Thread.sleep(3000);

	}

}
