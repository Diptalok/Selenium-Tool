package Selenium_WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T6__Print_text_and_AttributeValue {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//*[@type=\"text\"]"));
		element.sendKeys("bluetooth");
		element.submit();
		
		List<WebElement> cl = driver.findElements(By.xpath("//*[@class=\"a-price-whole\"]"));
		for (WebElement clas : cl) {
			System.out.println(clas.getText());
		}
		List<WebElement> ele = driver.findElements(By.tagName("a"));	
		for (WebElement el : ele) {
			/*System.out.println(el.getText());
			System.out.println(el.getTagName());
			System.out.println(el.getAccessibleName());
			System.out.println(el.getAriaRole());
			System.out.println(el.getAttribute("href"));
			System.out.println(el.getAttribute("class"));*/
			System.out.println(el.getDomAttribute("class"));
			System.out.println(el.getDomProperty("class"));
		}
		
	}

}
