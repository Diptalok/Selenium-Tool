package Selenium_WebDriver_TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class S2__FetchData_Excel {

	@Test
	public void fetch() throws Exception {
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







