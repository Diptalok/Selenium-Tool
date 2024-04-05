package Selenium_WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;*/

import io.github.bonigarcia.wdm.WebDriverManager;

public class S2__Browser_setup {

	public static void main(String[] args) {
		
		//case 2 :
		//launching bowser using selenium version 3
		//version : 3.141.59
		//launching browser using WebDriverManager
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver2 = new ChromeDriver();
		
		//WebDriverManager.edgedriver().setup();
		//WebDriver driver1 = new EdgeDriver();
								
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver3 = new FirefoxDriver();
				
				
	}

}
