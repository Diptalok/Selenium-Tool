package Selenium_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S5__Locators {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("https://www.saucedemo.com/v1/");
		Thread.sleep(2000);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		//from id and name and classname id has more prioroty
		driver.findElement(By.className("btn_action")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[4]/div[3]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[3]/div[3]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("shopping_cart_container")).click();                               
        Thread.sleep(2000);
        driver.findElement(By.linkText("CHECKOUT")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("first-name")).sendKeys("Diptalok");
        Thread.sleep(2000);
        driver.findElement(By.id("last-name")).sendKeys("Sahoo");
        Thread.sleep(2000);
        driver.findElement(By.id("postal-code")).sendKeys("751016");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/input")).click();
        Thread.sleep(2000);
        //linktest should use in <a> tag
        driver.findElement(By.linkText("FINISH")).click();
        Thread.sleep(5000);
        driver.close();
		
	}

}
