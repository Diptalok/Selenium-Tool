package Selenium_WebDriver_Adv_scenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class S7__Handling_dropdown_using_Select_cls {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        WebElement element1 = driver.findElement(By.xpath("(//select[1])[1]"));
        Select select1 = new Select(element1);
        Thread.sleep(2000);
        select1.selectByIndex(3);
        Thread.sleep(2000);
        select1.selectByValue("Java");
        Thread.sleep(2000);
        select1.selectByVisibleText("Python");
        
        WebElement element2 = driver.findElement(By.xpath("(//select[1])[3]"));
        Select select2 = new Select(element2);
        Thread.sleep(2000);
        select2.selectByIndex(7);
        Thread.sleep(2000);
        select2.selectByValue("India");
        Thread.sleep(2000);
        select2.selectByVisibleText("Australia");
        
        WebElement element3 = driver.findElement(By.xpath("(//select[1])[4]"));
        Select select3 = new Select(element3);
        Thread.sleep(2000);
        select3.selectByIndex(5);
        Thread.sleep(2000);
        select3.selectByValue("1998");
        Thread.sleep(2000);
        select3.selectByVisibleText("1997");
        
        WebElement element4 = driver.findElement(By.xpath("(//select[1])[5]"));
        Select select4 = new Select(element4);
        Thread.sleep(2000);
        select4.selectByIndex(3);
        Thread.sleep(2000);
        select4.selectByValue("April");
        Thread.sleep(2000);
        select4.selectByVisibleText("May");
        
        WebElement element5 = driver.findElement(By.xpath("(//select[1])[6]"));
        Select select5 = new Select(element5);
        Thread.sleep(2000);
        select5.selectByIndex(4);
        Thread.sleep(2000);
        select5.selectByValue("5");
        Thread.sleep(2000);
        select5.selectByVisibleText("14");

	}

}
