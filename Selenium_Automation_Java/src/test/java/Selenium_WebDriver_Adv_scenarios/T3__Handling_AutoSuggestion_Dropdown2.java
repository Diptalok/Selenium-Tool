package Selenium_WebDriver_Adv_scenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3__Handling_AutoSuggestion_Dropdown2 {

	public static void main(String[] args)throws Exception {
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("iphones");
        Thread.sleep(3000);
        List<WebElement> element = driver.findElements(By.xpath("//div[@class=\"left-pane-results-container\"]/div"));
        
        Thread.sleep(1000);
        
        for (WebElement ele : element) {
        	Thread.sleep(1000);
			String str = ele.getText();
			Thread.sleep(1000);
			System.out.println(str);
			Thread.sleep(1000);
			if(str.contains("iphone se back cover")) 
			{
				Thread.sleep(1000);
				ele.click();
				break;
			}
		}
        
        System.out.println("completed");

	}

}
