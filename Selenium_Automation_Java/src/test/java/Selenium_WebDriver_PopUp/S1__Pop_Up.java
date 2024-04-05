package Selenium_WebDriver_PopUp;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class S1__Pop_Up {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.foundit.in/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//div[@class=\"heroSection-buttonContainer"
				+ "_secondaryBtn secondaryBtn\"]")).click();
        
		WebElement txt = driver.findElement(By.xpath("//input[@name=\"file\"]"));
        //txt.click();
		Thread.sleep(5000);
		txt.sendKeys("D:\\Diptalok\\IT\\Diptalok Sahoo - Resume.docx");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@type=\"submit\"])[2]")).click();
	
	}

}
