package Selenium_WebDriver_Adv_scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class T4__Handling_SVG_Elements {

	public static void main(String[] args) throws Throwable {
		//svg - scalar vector graphics
		//*[name()="svg" and attribute name = attribute value]
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.kayak.co.in/");
        driver.manage().window().maximize();
        
        WebElement ele = driver.findElement(By.xpath("//*[name()=\"svg\" and @viewBox = \"0 0 125 24\"]"));
        ele.click();
        
		

	}

}
