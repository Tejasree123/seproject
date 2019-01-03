package package5; 
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class WriteExcel {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException   {
		// TODO Auto-generated method stub
		FileInputStream is = new FileInputStream("C:\\Users\\admin\\Documents\\Test.xlsx");
		Workbook wb = WorkbookFactory.create(is);
		Sheet s = wb.getSheet("Sheet1");
		
	
		for(int r=0;r<1;r++)
		{
		  //  Row row = s.getRow(1);
			  Row row = s.createRow(4);
			Row raw = s.createRow(7);
			Row rr = s.getRow(1);
			
			
			for(int c=0;c<1;c++)
			{
				row.createCell(3).setCellValue("Mani");
				row.createCell(4).setCellValue("Nani");
				row.createCell(5).setCellValue("vamsi");
				row.createCell(6).setCellValue("venkat");
				raw.createCell(1).setCellValue("Nani");
				raw.createCell(2).setCellValue("vamsi");
				raw.createCell(10).setCellValue("venkat");
				rr.createCell(1).setCellValue("pass");
				
				System.out.println("Successfully written");
					
			}
			
		}
		FileOutputStream out = new FileOutputStream("C:\\Users\\admin\\Documents\\Test.xlsx");
		
		wb.write(out);
		out.flush();
		out.close();


	}

}
