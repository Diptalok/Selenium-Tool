package Selenium_WebDriver_Framework;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class practice {

	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\dipta\\OneDrive\\Desktop\\practice.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("pract");
		Row row1 = sheet.getRow(0);
		Row row2 = sheet.getRow(1);
		Cell cel1 = row1.getCell(0);
		Cell cel2 = row1.getCell(1);
		Cell cel3 = row2.getCell(0);
		Cell cel4 = row2.getCell(1);
		String data1 = cel1.getStringCellValue();
		String data2 = cel2.getStringCellValue();
		String data3 = cel3.getStringCellValue();
		String data4 = cel4.getStringCellValue();
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
		System.out.println(data4);
		
		 Sheet sheet1 = book.getSheet("pract2");
		 Row row4 = sheet1.getRow(0);
		 Cell cell1 = row4.createCell(0);
		 Cell cell2 = row4.createCell(1);
		 cell1.setCellValue("Alok");
		 cell2.setCellValue("DiptSaho");
		 
		 FileOutputStream fos = new FileOutputStream(file);
		 book.write(fos);
		 //book.close();
		 
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 Row roww4 = sheet.getRow(4);
		 Cell celll1 = roww4.getCell(0);
		 String URL = celll1.getStringCellValue();
		 
		 Row roww5 = sheet.getRow(5);
		 Cell celll2 = roww5.getCell(0);
		 String UserName = celll2.getStringCellValue();
		 
		 Row roww7 = sheet.getRow(6);
		 Cell celll3 = roww7.getCell(2);
		 String Password = celll3.getStringCellValue();
		 
		 Row roww8 = sheet.getRow(8);
		 Cell celll4 = roww8.getCell(0);
		 String Locator = celll4.getStringCellValue();
		 
		 Row roww9 = sheet.getRow(9);
		 Cell celll5 = roww9.getCell(0);
		 String Locator1 = celll5.getStringCellValue();
		 
		 Cell celll6 = roww9.getCell(2);
		 String Locator2 = celll6.getStringCellValue();
		 
		 driver.get(URL);
		 driver.findElement(By.xpath(Locator1)).sendKeys(UserName);
		 driver.findElement(By.xpath(Locator2)).sendKeys(Password);
		 driver.findElement(By.xpath(Locator)).click();
		 
		 Workbook book1 = WorkbookFactory.create(fis);
		 Sheet sheet2 = book1.getSheet("pract2");
		 Row rowww1 = sheet2.getRow(6);
		 Cell ce1 = rowww1.getCell(0);
		 ce1.setCellValue("Test case passes successfully");
		 
		 FileOutputStream fos1= new FileOutputStream(file);
		 book1.write(fos1);
		 book1.close();
		 
	}

}
