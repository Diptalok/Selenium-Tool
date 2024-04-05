package Selenium_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2__Xpath_And_Or_Operator {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.linkText("Today's Deals")).click();
		driver.findElement(By.xpath("//a[text()=\"Today's Deals\" or text()=\"Mobiles\"]")).click();
		driver.findElement(By.xpath("//a[text()=\"Today's Deals\" or data-ca-c-type=\"nav_cs_4\"]")).click();
		//driver.findElement(By.xpath("//td[text()=\"RRR\"]"));
	}

}
