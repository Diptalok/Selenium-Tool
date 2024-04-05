package Selenium_WebDriver_Framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_Repository.LogIn;

public class S7__FetchingDataFrom_POM_rep {

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
        
		/*driver.get(URL);
		driver.findElement(By.id("user-name")).sendKeys(USERNAME);
		driver.findElement(By.name("password")).sendKeys(PASSWORD);
		driver.findElement(By.className("btn_action")).click();*/
		
		//1. using getter method approach
		// fetching data from POM class
		/*LogIn log = new LogIn(driver);
		driver.get(URL);
		log.getUserNameTextField().sendKeys(USERNAME);
		log.getPasswordField().sendKeys(PASSWORD);
		log.getLogInButton().click();*/
		
		//2. using Business logic
		driver.get(URL);
		LogIn log = new LogIn(driver);
		log.logintoApp(USERNAME, PASSWORD);

	}

}


