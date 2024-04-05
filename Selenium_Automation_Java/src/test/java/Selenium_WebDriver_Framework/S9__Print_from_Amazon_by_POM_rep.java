package Selenium_WebDriver_Framework;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_Repository.Amazon_Print;

public class S9__Print_from_Amazon_by_POM_rep {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		File file = new File("./amazon.properties");
	    FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		String URL = prop.getProperty("url");
		driver.get(URL);
		String SEARCH = prop.getProperty("search");
		
		Amazon_Print ap = new Amazon_Print(driver);
		WebElement ser = ap.getSearch_bar();
		ser.sendKeys(SEARCH, Keys.ENTER);
		
		List<WebElement> mob = ap.getAllmob();
		for (WebElement ele : mob) {
			System.out.println(ele.getText());
		}
		
		List<WebElement> prc = ap.getAllpr();
		for (WebElement ele : prc) {
			System.out.println(ele.getText());
		}
		
		

	}


}
