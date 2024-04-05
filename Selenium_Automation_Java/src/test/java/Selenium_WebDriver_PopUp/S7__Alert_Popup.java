package Selenium_WebDriver_PopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S7__Alert_Popup {

	public static void main(String[] args) throws InterruptedException {
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
