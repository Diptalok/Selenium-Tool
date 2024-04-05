package Selenium_WebDriver_Adv_scenarios;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class S5__Handling_DropDown_ListBox {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
        
        Thread.sleep(5000);
        
        WebElement day = driver.findElement(By.xpath("//*[@aria-label=\"Day\"]"));
        Thread.sleep(3000);
        day.click();
        
        Thread.sleep(3000);
        
        day.sendKeys(Keys.ARROW_DOWN);
        day.sendKeys(Keys.ARROW_DOWN);
        day.sendKeys(Keys.ARROW_DOWN);
        day.sendKeys(Keys.ARROW_DOWN);
        
        WebElement month = driver.findElement(By.xpath("//*[@aria-label=\"Month\"]"));
        month.click();
        month.sendKeys(Keys.ARROW_DOWN);
        month.sendKeys(Keys.ARROW_DOWN);
        month.sendKeys(Keys.ARROW_DOWN);
        month.sendKeys(Keys.ARROW_DOWN);
        
        
        Robot robot = new  Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        
	}

}
