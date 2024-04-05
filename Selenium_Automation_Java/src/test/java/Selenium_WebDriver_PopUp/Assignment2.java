package Selenium_WebDriver_PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Thread.sleep(1000);
		WebElement top_frame = driver.findElement(By.xpath("//frame[@name=\"frame-top\"]"));
		Thread.sleep(1000);
		driver.switchTo().frame(top_frame);
		Thread.sleep(1000);
		driver.switchTo().frame("frame-middle");
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.xpath("//div[.=\"MIDDLE\"]"));
		Thread.sleep(1000);
		System.out.println(ele.getText());
		driver.switchTo().parentFrame();
		Thread.sleep(1000);
		WebElement bottom_frame = driver.findElement(By.xpath("//frame[@name=\"frame-bottom\"]"));
		Thread.sleep(1000);
		driver.switchTo().frame(bottom_frame);
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		Thread.sleep(1000);
		act.doubleClick(bottom_frame);
		
		
		
	}

}
