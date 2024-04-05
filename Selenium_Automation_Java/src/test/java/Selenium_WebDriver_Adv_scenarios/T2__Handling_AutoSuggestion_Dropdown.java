package Selenium_WebDriver_Adv_scenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2__Handling_AutoSuggestion_Dropdown {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("bluetooth");
        
        Thread.sleep(4000);
        List<WebElement> element = driver.findElements(By.xpath("//ul[@class=\"_1sFryS _2x2Mmc _3ofZy1\"]//li"));
        
        
        Thread.sleep(1000);
        for ( WebElement ele : element) 
        {
        	Thread.sleep(1000);
        	String str=ele.getText();
			Thread.sleep(1000);
        	System.out.println(str);
			Thread.sleep(1000);
			if(str.contains("bluetooth earphone")) 
			{
				Thread.sleep(1000);
				ele.click();
				break;
			}
			
			
		}
        
        System.out.println("completed");

	}

}
