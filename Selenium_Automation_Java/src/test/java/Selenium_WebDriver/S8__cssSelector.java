package Selenium_WebDriver;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class S8__cssSelector {

	public static void main(String[] args) throws InterruptedException {

       WebDriver driver = new ChromeDriver();
       driver.get("https://www.saucedemo.com/v1/");
       driver.manage().window().maximize();
       
       //cssSelector can be any attribute any html tag
       //cssSelector is not applicable for link having <a> tag, xpath is used
       
       // syntax 1 = [attribute="attribute value"]
       //driver.findElement(By.cssSelector("[type=\"text\"]")).sendKeys("Miku");
       
       //syntax 2 = htmaltag[attribute="attribute value"]
       //driver.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("Miku");
       
       //syntax 3 = for id '#' is used = "#attribute value"
       //driver.findElement(By.cssSelector("#user-name")).sendKeys("Miku");
       
       //syntax 4 = for id = "htmaltag#attribute value"
       //driver.findElement(By.cssSelector("input#user-name")).sendKeys("Miku");
       
       //syntax 5 = for className '.' is used = ".attribute value"
       //driver.findElement(By.cssSelector(".form_input")).sendKeys("Miku");
       
       //syntax 6 = for className = "htmltag.attribute value"
       driver.findElement(By.cssSelector("input.form_input")).sendKeys("Miku");

       //Thread.sleep(2000);
       //driver.quit();
       
	}

}
