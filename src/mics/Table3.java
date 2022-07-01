package mics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\sell jars\\chromedriver_win32 (2)//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Velocity/Java%20Class/Aug2021%20Class/Java%20notes/Webpage/table.html");
		Thread.sleep(1000);
		
		
	}

}
