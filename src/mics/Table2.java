package mics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\sell jars\\chromedriver_win32 (2)//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		
		driver.manage().window().maximize();
		WebElement po = driver.findElement(By.xpath("(//div[@class='w3-example'])[1]"));
		
		JavascriptExecutor op=((JavascriptExecutor)driver);
		
		 op.executeScript("arguments[0].scrollIntoView(true);",po);
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		 
	 List<WebElement> noRows = driver.findElements(By.xpath("(//table)[1]//tr"));
		 List<WebElement> NoColumn = driver.findElements(By.xpath("(//table)[1]//td"));
		int ToatalRows = noRows.size();
		int TotalColumn = NoColumn.size();
		 System.out.println("no of rows " +ToatalRows);
		 System.out.println("no of columns " + TotalColumn);
//		 	 
//	 for(int i=1;i<=ToatalRows;i++) {
//			 for(int j=1;j<=TotalColumn;j++) {
//				 
//				if(i==1) {
//			String text = driver.findElement(By.xpath("(//table)[1]//tr["+i+"]//th["+i+"]")).getText();
//			System.out.println(text +" ");
//			} 	
//			 else {	
//				
//				String text = driver.findElement(By.xpath("(//table)[1]//tr[" +i+ "]//td[" +j+ "]")).getText();
//					System.out.println(text +" ");				}
//					 }
//	 System.out.println();
//					 }
		 
		 
		 
		List<WebElement> table = driver.findElements(By.xpath("//table[@id='customers']"));
		
		
		for(WebElement s:table) {
			System.out.println(s.getText());
		}
		 
	}
	
}
