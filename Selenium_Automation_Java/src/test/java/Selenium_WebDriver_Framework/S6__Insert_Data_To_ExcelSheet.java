package Selenium_WebDriver_Framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class S6__Insert_Data_To_ExcelSheet {

	public static void main(String[] args) throws Exception {
		File file = new File("D:\\Diptalok\\IT\\NewData.xlsx");		
		FileInputStream fis = new FileInputStream(file);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Sheet1");
		Row row = sheet.getRow(0);
		Cell cel = row.createCell(9);
		cel.setCellValue("Miku");
		Cell cel2 = row.createCell(5);
		cel2.setCellValue("Diptalok");
		Cell cel3 = row.createCell(6);
		cel3.setCellValue("Diptalok");
		
		
		FileOutputStream fos = new FileOutputStream(file);
		book.write(fos);
		book.close();

	}

}

/*
File()
FileInputStream(file)
WorkbookFactory.create(fis)
book.getSheet(sheet name)
sheet.getRow(row number)
row.createCell(cell no)
cel.setCellValue("string")
FileInputStream(file)
book.write(fos)
book.close();
*/
