package kite_App_Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Utility_using_properties {
	public static void screenshot(WebDriver driver) throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String randostring=RandomString.make(3);
		File dest=new File("C:\\Users\\dell\\Desktop\\sell jars\\"+randostring +"vikram.xlsx");
		FileHandler.copy(src, dest);
		
	}

	public static String Getdatafromproperties(String Key) throws IOException {
		
		Properties prop=new Properties();
		FileInputStream myprop=new FileInputStream("C:\\Users\\dell\\eclipse-workspace\\AutomationJava\\Kite.properties");
		prop.load(myprop);
		String value  = prop.getProperty(Key);
		return value;
		
		
	}
	public static void StaticWait(WebDriver driver,int time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
	}
}
