package Selenium_WebDriver_Framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class S4__Fetching_all_data_from_excel {

	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\dipta\\OneDrive\\Desktop\\practice_d.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Sheet1");
        int row = sheet.getLastRowNum();
        
		
		for (int i = 0; i < row; i++) {
			Row r1 = sheet.getRow(i);
			for (int j = 0; j < r1.getLastCellNum(); j++) {
				Cell c1 = r1.getCell(j);
				
				//print all the values of the sheet
				System.out.print(c1.getStringCellValue()+"\t");
				//System.out.print(c1.toString()+"\t");
				
			}
			System.out.println();
		}
	}

}
