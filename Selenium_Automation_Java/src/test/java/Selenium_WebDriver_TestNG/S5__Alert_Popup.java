package Selenium_WebDriver_TestNG;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class S5__Alert_Popup {

	@Test
	public void alert() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//button[.=\"Click for JS Alert\"]")).click();
        
		Thread.sleep(1000);
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		
		driver.findElement(By.xpath("//button[.=\"Click for JS Confirm\"]")).click();
		Thread.sleep(1000);
		System.out.println(alt.getText());
		//alt.accept();
		alt.dismiss();
		
		driver.findElement(By.xpath("//button[.=\"Click for JS Prompt\"]")).click();
		Thread.sleep(1000);
		System.out.println(alt.getText());
		alt.sendKeys("qspider");
		Thread.sleep(1000);
		alt.accept();
		//alt.dismiss();

	}

}
