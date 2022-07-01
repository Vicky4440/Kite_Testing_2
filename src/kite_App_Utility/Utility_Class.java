package kite_App_Utility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Utility_Class {
	
	
	
	
	
	
	
	
	
	public static String readdatafromExcel( int row , int cell) throws EncryptedDocumentException, IOException {
		
File filenew= new File("C:\\Users\\dell\\Desktop\\sell jars//vikram.xlsx");
		
		
		Sheet sheet = WorkbookFactory.create(filenew).getSheet("Sheet4");
		String myvalue = sheet.getRow(row).getCell(cell).getStringCellValue();
		return myvalue;
		
	}
	public static void screenshot(WebDriver driver) throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String randostring=RandomString.make(3);
		File dest=new File("C:\\Users\\dell\\Desktop\\sell jars\\"+randostring +"vikram.xlsx");
		FileHandler.copy(src, dest);
		
	}

}
