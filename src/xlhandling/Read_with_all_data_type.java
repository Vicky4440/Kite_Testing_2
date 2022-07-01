package xlhandling;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_with_all_data_type {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		File newfile=new File("C:\\\\Users\\\\dell\\\\Desktop\\\\sell jars//vikram.xlsx");
		
		Sheet sheet = WorkbookFactory.create(newfile).getSheet("Sheet3");
		
		
		int totalrow = sheet.getLastRowNum();
		int totalcell = sheet.getRow(totalrow).getLastCellNum()-1;
		
		
		for(int i=0;i<totalrow;i++) {
			for(int j=0;j<totalcell;j++) {
				//declare cell type
				Cell cell = sheet.getRow(i).getCell(j);
				CellType type = cell.getCellType();
				
				if(type==CellType.STRING) {
					System.out.print(cell.getStringCellValue()+" ");
				}
				else if (type==CellType.BOOLEAN) {
					System.out.println(cell.getBooleanCellValue()+" ");
				}
				else if(type==CellType.NUMERIC) {
					System.out.print(cell.getNumericCellValue()+" ");
				}
			}
			System.out.println();
		}
		
		
		
	}

}
