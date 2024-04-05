package Selenium_WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class T1__Assignment1_Flipkart_Print {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.name("q")).sendKeys("bluetooth");
		driver.findElement(By.className("_2iLD__")).click();
		WebElement ele = driver.findElement(By.cssSelector("._30jeq3"));
		String str = ele.getText();
		System.out.println(str);
		//ele.click();
		String str2=driver.findElement(By.xpath("//a[text()=\"truke BTG1 Earbuds with Game Mode, 48H Playtime, Quad M...\"]")).getText();
		System.out.println(str2);
		String str3=driver.findElement(By.xpath("//a[contains(text(),\"Apple AirPods(2nd gen) with Charging Case Bluetooth Hea...\")]")).getText();
		System.out.println(str3);
		Thread.sleep(2000);
		driver.navigate().back();
		
	}

}
