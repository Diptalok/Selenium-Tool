package Selenium_WebDriver_Framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_Repository.Flipkart_Print;

public class S8__Print_from_Flipkart_by_POM_rep {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		File file = new File("./pomcls.properties/");
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		
		//enter flipkart in browser\
		String URL = prop.getProperty("url");
		driver.get(URL);
		String SEARCH = prop.getProperty("search");
		
		Flipkart_Print fp = new Flipkart_Print(driver);
		//search
		fp.getSearch().sendKeys(SEARCH,Keys.ENTER);
		//driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys(SEARCH,Keys.ENTER);
		
		//print mobile name
		//List<WebElement> element = driver.findElements(By.xpath("//div[@class=\"_4rR01T\"]"));
		List<WebElement> element = fp.getAllmob();
		for (WebElement ele : element) {
			System.out.println(ele.getText());
		}
		
		//print mobile price
		//List<WebElement> element1 = driver.findElements(By.xpath("//div[@class=\"_30jeq3 _1_WHN1\"]"));
		List<WebElement> element1 = fp.getAllprice();
		for (WebElement ele : element1) {
			System.out.println(ele.getText());
		}
		
		//business logic
		//fp.logintoApp(SEARCH);
		

	}

}
