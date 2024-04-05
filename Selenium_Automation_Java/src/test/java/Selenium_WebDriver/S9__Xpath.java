package Selenium_WebDriver;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class S9__Xpath {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.cssSelector("input[data-test=\"username\"]")).sendKeys("miku");
		//driver.findElement(By.xpath("//input[@data-test=\"password\"]")).sendKeys("miku");
		
		//xpath by attribute 
		//syntax 1 : //tagname[@attribute="value"]
		//   or    : //*[@atttribute="value"]
		
		/*driver.findElement(By.xpath("//*[@placeholder=\"Username\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@type=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@value=\"LOGIN\"]")).click();
		
		Thread.sleep(2000);
		driver.navigate().to("https://www.flipkart.com/");*/
		
		//xpath by visible text 
		//syntax 2 : //tagname[text()="attributevalue"]
		
		//if anchor tag a is there, we should use link text or partial linktext
		//or else we can use visible text method
		
		/*Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=\"✕\"]")).click();
		driver.findElement(By.xpath("//span[text()=\"Mobiles\"]")).click();*/
		
		//xpath by contains attribute 
		//syntax 3 : //tagname[contains(@attribute,"value")]
		
		driver.findElement(By.xpath("//input[contains(@type,\"xt\")]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[contains(@type,\"p\")]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[contains(@value,\"LOG\")]")).submit();
		
		//                  OR
		
		//syntax for group by index :----->  (path)[index]
		//driver.findElement(By.xpath("//input[@autocorrect=\"off\"][1]")).sendKeys("standard_user");
		//driver.findElement(By.xpath("//input[@autocorrect=\"off\"][2]")).sendKeys("secret_sauce");
		//driver.findElement(By.xpath("//input[contains(@value,\"LOG\")]")).click();
		
		Thread.sleep(2000);
		driver.navigate().to("https://www.flipkart.com/");
		
		//xpath by contains visible text 
		//syntax 4 : //tagname[contains(text(),"attributevalue")]
		
		//if anchor tag a is there, we should use link text or partial linktext
		//or else we can use visible text method
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),\"✕\")]")).click();
		driver.findElement(By.xpath("//span[contains(text(),\"Mob\")]")).click();
		
		
		//xpath by attribute with and / or operator
		//driver.findElement(By.xpath("//input[@data-test=\"username\" or @data-test=\"password\"]")).sendKeys("standard_user");
		//driver.findElement(By.xpath("//input[@data-test=\"password\" or @ata-test=\"username\"]")).sendKeys("secret_sauce");
		//driver.findElement(By.xpath("//input[@class=\"btn_action\" or @dta-test=\"username\"]")).click();
		
	}

}
