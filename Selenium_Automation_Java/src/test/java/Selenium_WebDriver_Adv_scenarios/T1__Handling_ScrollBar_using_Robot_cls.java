package Selenium_WebDriver_Adv_scenarios;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1__Handling_ScrollBar_using_Robot_cls {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.meesho.com/");
        driver.manage().window().maximize();
        
        Robot rb = new Robot();
        
        Thread.sleep(2000);
        rb.keyPress(KeyEvent.VK_PAGE_DOWN);
        rb.keyRelease(KeyEvent.VK_PAGE_DOWN);
        Thread.sleep(2000);
        rb.keyPress(KeyEvent.VK_PAGE_DOWN);
        rb.keyRelease(KeyEvent.VK_PAGE_DOWN);
        Thread.sleep(2000);
        rb.keyPress(KeyEvent.VK_PAGE_DOWN);
        rb.keyRelease(KeyEvent.VK_PAGE_DOWN);
	}

}
