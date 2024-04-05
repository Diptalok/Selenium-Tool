package Selenium_WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class T5__Assignment2_Amazon_Print {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("iphones");
		driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
		
		List<WebElement> names =driver.findElements(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]"));
		int i = 0;
		for (WebElement name : names) 
		{
			System.out.println(name.getText());
			int count = i++;
		}
		System.out.println("total phones are = "+i);
			
	}

}
