package Selenium_WebDriver_PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.booking.com/flights/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("(//button[@class=\"css-1ovag24\"])[3]")).click();
		
		driver.findElement(By.xpath("((//div[@class=\"Calendar-module__monthWrapper___6FH+y\"])[1]/"
				+ "descendant::span[.=\"21\"])[3]")).click();
		
		driver.findElement(By.xpath("((//div[@class=\"Calendar-module__monthWrapper___6FH+y\"])[2]/"
				+ "descendant::span[.=\"26\"])[3]")).click();
		
		driver.navigate().to("https://www.goibibo.com/flights/");
		
		driver.findElement(By.xpath("//span[@role=\"presentation\"]")).click();
		driver.findElement(By.xpath("(//div[@class=\"sc-12foipm-16 wRKJm fswFld \"])[3]")).click();
		driver.findElement(By.xpath("//span[@tabindex=\"0\"][2]")).click();
		
		driver.findElement(By.xpath("(//div[@class=\"DayPicker-Month\"])[2]/descendant::div[.=\"24\"]")).click();
		driver.findElement(By.xpath("//p[.=\" Click to add a return flight for better discounts\"]")).click();
		driver.findElement(By.xpath("//span[@tabindex=\"0\"][2]")).click();
		int date = 29;
		driver.findElement(By.xpath("(//div[@class=\"DayPicker-Month\"])[2]/descendant::div[.=\""+date+"\"]")).click();
		
	}

}
