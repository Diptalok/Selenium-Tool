package Selenium_WebDriver_PopUp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("iphones", Keys.ENTER);
		
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//div[.=\"APPLE iPhone 14 (Midnight, 256 GB)\"]"
				+ "/ancestor::div[@class=\"_3pLy-c row\"]/descendant::div[.=\"₹68,999\"]"));
		System.out.println(ele.getText());
		
		List<WebElement> elem = driver.findElements(By.xpath("//div[@class=\"_30jeq3 _1_WHN1\"]"));
		for (WebElement el : elem) {
			System.out.println(el.getText());
		}
		
		List<WebElement> eleme = driver.findElements(By.xpath("//div[@class=\"_4rR01T\"]"));
		for (WebElement el : eleme) {
			System.out.println(el.getText());
		}
		
		


	}

}
