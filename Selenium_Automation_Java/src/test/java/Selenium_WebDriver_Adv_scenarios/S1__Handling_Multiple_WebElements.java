package Selenium_WebDriver_Adv_scenarios;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class S1__Handling_Multiple_WebElements {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		List<WebElement> ele = driver.findElements(By.tagName("a"));
		
		int count=0;
		for(WebElement el : ele) {
			System.out.println(el.getText());
			count++;
		}
		System.out.println("total links is "+count);
	}

}
