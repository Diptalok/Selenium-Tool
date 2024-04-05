package Selenium_WebDriver_Framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class S2__Fetch_data_from_Excel {

	public static void main(String[] args) throws Exception {
		//File file = new File("D:\\Diptalok\\IT\\Excel Data.xlsx");
		//File file = new File("./Excel Data.xlsx");
		
		File file = new File("./testData/Excel Data.xlsx");		
		FileInputStream fis = new FileInputStream(file);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Sheet1");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		String data = cell.getStringCellValue();
		System.out.println(data);
		
		/*to get the sheet by sheet index
		Sheet sheet = book.getSheetAt(0);  0-sheet index
		
		//to get the sheet name
		String sname = sheet.getSheetName();
		System.out.println(sname);
		
		//to get the cell value using sheet name
		String val = book.getSheet(sname).getRow(4).getCell(4).getStringCellValue();
		System.out.println(val);
		
		//to get the cell value using sheet index
		String val = book.getSheetAt(0).getRow(4).getCell(4).getStringCellValue();
		System.out.println(val); 
		
		//to get sheet index
		int inx = book.getSheetIndex("Sheet1");
		System.out.println(inx);
		
		//to get sheet name
		String name = book.getSheetName(0);
		System.out.println(name);
		*/
		
	
	}

}

/*
File()
FileInputStream(file)
WorkbookFactory.create(fis)
book.getSheet(sheet name)
sheet.getRow(row number)
row.getCell(cell no)
getStringCellValue
*/







