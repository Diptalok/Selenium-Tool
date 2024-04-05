package Selenium_WebDriver_Adv_scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class S8__Handling_dropdown_using_locator {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//option[@value=\"AutoCAD\"]")).click();
        driver.findElement(By.xpath("//option[text()=\"September\"]")).click();
        driver.findElement(By.xpath("//option[.=\"India\"]")).click();
        
        //to type and search and select
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class=\"select2-selection__arrow\"]")).click();
        Thread.sleep(2000);
        WebElement ele = driver.findElement(By.xpath("//*[@type=\"search\"]"));
        Thread.sleep(2000);
        ele.sendKeys("Aus");
        Thread.sleep(2000);
        ele.sendKeys(Keys.ENTER);

      
	}

}
