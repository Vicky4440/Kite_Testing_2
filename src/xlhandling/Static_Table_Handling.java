package xlhandling;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Static_Table_Handling {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		File filenew= new File("C:\\Users\\dell\\Desktop\\sell jars//vikram.xlsx");
		
		
		Sheet sheet = WorkbookFactory.create(filenew).getSheet("Sheet2");
		
		//Static Table
		
		for(int i=0;i<=3;i++) {
			
			String cc = sheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(cc);
		}
		System.out.println("=======================");

  for(int i=0;i<=2;i++) {
			
			String cc = sheet.getRow(0).getCell(i).getStringCellValue();
			System.out.println(cc);
		}
		

		
		
	}

}
