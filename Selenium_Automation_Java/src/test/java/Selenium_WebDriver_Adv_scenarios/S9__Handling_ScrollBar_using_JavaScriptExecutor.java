package Selenium_WebDriver_Adv_scenarios;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S9__Handling_ScrollBar_using_JavaScriptExecutor {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.meesho.com/");
        driver.manage().window().maximize();
        
        JavascriptExecutor js = (JavascriptExecutor)driver;
        
        /*Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,6000)");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(3000,0)");*/
        
        
        for (int i = 0; i < 3; i++) 
        {
        	js.executeScript("window.scrollBy(0,1000)");
        	Thread.sleep(2000);
		}
        
        for (int i = 0; i < 3; i++) 
        {
        	js.executeScript("window.scrollBy(0,-1000)");
        	Thread.sleep(2000);
		}
        
        for (int i = 0; i < 3; i++) 
        {
        	js.executeScript("window.scrollBy(1000,0)");
        	Thread.sleep(2000);
		}
        
        for (int i = 0; i < 3; i++) 
        {
        	js.executeScript("window.scrollBy(-1000,0)");
        	Thread.sleep(2000);
		}
        
        /*js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(3000);
        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");*/

	}

}
