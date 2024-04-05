package Selenium_WebDriver_Adv_scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class S4__Handling_Mouse_Actions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//*[@class=\"nav-a  \"][4]"));
		Actions act = new Actions(driver);
		//to move to a particular web element
		act.moveToElement(ele).perform();
		//to perform click
		act.click(ele).perform();
		//to click and hold a particular web elemenet
		/*
		act.clickAndHold(ele).perform();
		//to release the mouse control
		act.release().perform();
		*/
		//to perform right click
		//act.contextClick(ele).perform();
		//to perform double click
		//act.doubleClick(ele).perform();
		
		/*Thread.sleep(2000);
		driver.navigate().to("https://www.saucedemo.com/v1/");
		WebElement un = driver.findElement(By.xpath("//*[@type=\"text\"]"));
		WebElement ps = driver.findElement(By.xpath("//*[@type=\"password\"]"));
		WebElement lg = driver.findElement(By.xpath("//*[@type=\"submit\"]"));
		
		act.sendKeys(un,"standard_user").perform();
		act.sendKeys(ps,"secret_sauce").perform();
		act.click(lg).perform();
		
		//build() - if multiple action method are there then to perform action in the
		//same sequence this method is used
		
		//act.sendKeys(un,"standard_user").sendKeys(ps,"secret_sauce").click(lg).build().perform();
		
		Thread.sleep(2000);
		driver.navigate().to("https://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement drag = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement drop = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
		Thread.sleep(2000);
		act.dragAndDrop(drag, drop).perform();
		
		//act.clickAndHold(drag).release(drop).perform();
		
		Thread.sleep(2000);
		driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement mte = driver.findElement(By.xpath("//button[.=\"Double-Click Me To See Alert\"]"));
		
		act.doubleClick(mte).perform();*/
		
		Thread.sleep(2000);
		driver.navigate().to("https://www.makemytrip.com/");
		act.moveByOffset(20,10).click().perform();
		
		
	}

}
