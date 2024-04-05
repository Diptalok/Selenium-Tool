package Selenium_WebDriver_TestNG;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class S6__Flipkart_Print {

	@Test
	public void fl() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.name("q")).sendKeys("bluetooth");
		driver.findElement(By.className("_2iLD__")).click();
		WebElement ele = driver.findElement(By.cssSelector("._30jeq3"));
		String str = ele.getText();
		System.out.println(str);
		
	}

}
