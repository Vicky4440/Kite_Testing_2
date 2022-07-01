package verification_testNg_assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Verification {
  @Test
  public void method() throws InterruptedException {
System.setProperty("webdriver.chrome.driver",  "C:\\Users\\dell\\Desktop\\sell jars\\chromedriver_win32 (2)//chromedriver.exe");

WebDriver driver= new ChromeDriver();

driver.manage().window().maximize();

driver.get("https://vctcpune.com/selenium/practice.html");

           WebElement check = driver.findElement(By.id("checkBoxOption1"));
           
           check.click();
           Thread.sleep(1000);
  Assert.assertTrue(check.isSelected(),"test case is failed");
  Reporter.log("test case is passed", true);
           
           
  }
}
