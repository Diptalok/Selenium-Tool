package Selenium_WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S1__Browser_setup {

	public static void main(String[] args) {
		
		//case 1 :
		//launching bowser using selenium version 3
		//version : 3.141.59
				
		String key="webdriver.driver.chrome";
		String value = "./chromedriver.exe";
		//String value = "C:\\Users\\dipta\\Downloads\\chromedriver-win64  (1)\\chromedriver-win64";
		System.setProperty(key, value);
				
		WebDriver driver=new ChromeDriver();
		

	}

}
