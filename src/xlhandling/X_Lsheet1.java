package xlhandling;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class X_Lsheet1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		File filenew= new File("C:\\Users\\dell\\Desktop\\sell jars//vikram.xlsx");
       
		
		String op = WorkbookFactory.create(filenew).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(op);
		
		
		String vp = WorkbookFactory.create(filenew).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		
		System.out.println(vp);
		
		//getnumericcellvalue
		
		double ap = WorkbookFactory.create(filenew).getSheet("Sheet1").getRow(2).getCell(0).getNumericCellValue();
		
		System.out.println(ap);
		
		
		boolean zp = WorkbookFactory.create(filenew).getSheet("Sheet1").getRow(3).getCell(0).getBooleanCellValue();
		System.out.println(zp);
		
		
	
		}
		
		
	}


