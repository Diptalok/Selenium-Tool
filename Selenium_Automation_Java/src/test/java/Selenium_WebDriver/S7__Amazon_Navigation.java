package Selenium_WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class S7__Amazon_Navigation {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        
        Thread.sleep(1000);
        driver.findElement(By.id("nav-logo-sprites")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@id=\"icp-nav-flyout\"]")).click();
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("ap_email")).sendKeys("8249356074");
        Thread.sleep(1000);
        driver.findElement(By.className("a-button-input")).click();
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().back();
        driver.findElement(By.id("nav-cart")).click();
        driver.navigate().back();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Today's Deals")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"anonCarousel1\"]/ol/li[4]/a/span[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.partialLinkText("Today's D")).click();
        
   
	}

}
