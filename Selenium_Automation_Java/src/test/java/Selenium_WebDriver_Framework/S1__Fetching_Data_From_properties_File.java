package Selenium_WebDriver_Framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S1__Fetching_Data_From_properties_File {

	public static void main(String[] args) throws Throwable {

		// launching browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// set the path of the document(external file path)
		// File file = new File("D:\\Diptalok\\IT\\PropertiesData.properties");
		File file = new File("./testData/data.properties/");
		FileInputStream fis = new FileInputStream(file);

		// load properties file data to java system
		Properties prop = new Properties();
		prop.load(fis);

		// fetching data from properties file
		String URL = prop.getProperty("url");
		String USERNAME = prop.getProperty("username");
		String PASSWORD = prop.getProperty("password");

		driver.get(URL);
		driver.findElement(By.id("user-name")).sendKeys(USERNAME);
		driver.findElement(By.name("password")).sendKeys(PASSWORD);
		driver.findElement(By.className("btn_action")).click();

	}

}

/*
 * File()
 * FileInputStream(file)
 * Properties()
 * Properties.load(fis)
 * properties.getProperty()
 */
