package xlhandling;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Dynamic_Table_Handling {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		File filenew= new File("C:\\Users\\dell\\Desktop\\sell jars//vikram.xlsx");
		
		
		
		Sheet sheet = WorkbookFactory.create(filenew).getSheet("Sheet2");
		
		
		//Dynamic_Table_Coding
		
		int lastrowno = sheet.getLastRowNum();
		short lastcellno = sheet.getRow(0).getLastCellNum();
		
		int lastcel=lastcellno-1;
		
		for(int i=0;i<=lastrowno;i++) {
			
			String value = sheet.getRow(i).getCell(1).getStringCellValue();
			System.out.println(value);
		}
		
		System.out.println("============");
	
		
		for(int i=0;i<=lastcel;i++) {
			
			String value = sheet.getRow(2).getCell(i).getStringCellValue();
			System.out.println(value);
		}
		System.out.println("============");
		
		//print all table
		
		for(int i=0;i<=lastrowno;i++) {
			for(int j=0;j<=lastcel;j++) {
				String vp = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print("|"+vp+"|");
			}
			System.out.println(" ");
			
		}
		
		
		
		
		
	}
	

}
