package package5;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {
	public static String s1;
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("C:\\Users\\admin\\Documents\\Read.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet("Data");
		int rowcount = s.getLastRowNum();
		System.out.println(rowcount);
		
		for(int i=0;i<rowcount+1;i++)
		{ 
			Row r = s.getRow(i);
			int cellcount = r.getLastCellNum();
			System.out.println(cellcount);
			for(int j=0;j<cellcount;j++)
	
			{
				Cell c = r.getCell(j);
				if(c.getCellType()==Cell.CELL_TYPE_STRING)
				{
					s1 = c.getStringCellValue();
					System.out.println(s1);
					
				}
				else if(c.getCellType()==Cell.CELL_TYPE_NUMERIC)
				{
					s1 = String.valueOf(c.getNumericCellValue());
					System.out.println(s1);
				}
			}
		}

	}

}
