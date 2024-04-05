package Selenium_WebDriver_Adv_scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S9__Handling_ScrollBar_using_JavaScriptExecutor2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        
        /*WebElement ele = driver.findElement(By.xpath("//a[.=\"Help\"]"));
        Point loc = ele.getLocation();
        System.out.println(loc.getX());
        System.out.println(loc.getY());
        
        JavascriptExecutor js = (JavascriptExecutor)driver;
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(194,825)");
        
        WebElement ele = driver.findElement(By.xpath("//a[.=\"Instagram\"]"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView()",ele);
        Thread.sleep(3000);
        ele.click();*/
        
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(3000);
        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");

	}

}
