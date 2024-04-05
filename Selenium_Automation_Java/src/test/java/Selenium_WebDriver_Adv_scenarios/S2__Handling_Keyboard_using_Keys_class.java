package Selenium_WebDriver_Adv_scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S2__Handling_Keyboard_using_Keys_class {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		//case - 1
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("secret_sauce");
		//driver.findElement(By.id("login-button")).sendKeys(Keys.ENTER);
		pass.sendKeys(Keys.ENTER);
		//pass.sendKeys("secret_sauce", Keys.ENTER);
		
		//Note : Keys class is always used inside the sendkeys method
		
		//case - 2
		Thread.sleep(2000);
		driver.navigate().to("https://www.saucedemo.com/v1/");
		Thread.sleep(2000);
		driver.findElement(By.name("user-name")).sendKeys("standard_user",Keys.TAB,"secret_sauce",Keys.ENTER);
		
	}

}
