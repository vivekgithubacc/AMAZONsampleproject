package Generic_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_File {

	public String getAMAZONExceldata1(String sheetname,int rownum,int cellnum) throws Throwable
	{
		FileInputStream fis1= new FileInputStream("./src/test/resources/amazondata1.xlsx");
		Workbook book = WorkbookFactory.create(fis1);
		Sheet sh = book.getSheet("amazproduct");
		Row row = sh.getRow(0);
		Cell cell = row.getCell(0);
		String data1 = cell.getStringCellValue();
		return data1;
				
	}
	public String getAMAZONExceldata2(String sheetname,int rownum,int cellnum) throws Throwable
	{
		FileInputStream fi2= new FileInputStream("./src/test/resources/amazondata2.xlsx");
		Workbook book = WorkbookFactory.create(fi2);
		Sheet sh = book.getSheet("productamz");
		Row row = sh.getRow(0);
		Cell cell = row.getCell(0);
		String data2= cell.getStringCellValue();
		return data2;
				
	}
	
}
