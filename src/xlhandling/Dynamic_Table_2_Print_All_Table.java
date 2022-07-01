package xlhandling;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Dynamic_Table_2_Print_All_Table {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		File filenew= new File("C:\\Users\\dell\\Desktop\\sell jars//vikram.xlsx");
		
		
		Sheet sheet = WorkbookFactory.create(filenew).getSheet("Sheet3");
		
		
		int lastrow = sheet.getLastRowNum();
		short lastcell = sheet.getRow(0).getLastCellNum();
		
		
		int lastcellno = lastcell-1;
		
		for(int i=0;i<=lastrow;i++) {
			
			for(int j=1;j<=lastcellno;j++) {
				String table = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print("|"+table+"|");
			}
			System.out.println();
		}
		
		
	}

}
