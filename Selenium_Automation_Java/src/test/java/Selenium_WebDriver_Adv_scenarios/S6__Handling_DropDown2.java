package Selenium_WebDriver_Adv_scenarios;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class S6__Handling_DropDown2 {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();
        
        WebElement ele = driver.findElement(By.xpath("//*[@id=\"Skills\"]"));
        ele.click();
        
        ele.sendKeys(Keys.ARROW_DOWN);
        ele.sendKeys(Keys.ARROW_DOWN);
        ele.sendKeys(Keys.ARROW_DOWN);
        
        WebElement ele1 = driver.findElement(By.xpath("//*[@id=\"yearbox\"]"));
        ele1.click();
        ele1.sendKeys(Keys.ARROW_DOWN);
        ele1.sendKeys(Keys.ARROW_DOWN);
        ele1.sendKeys(Keys.ARROW_DOWN);
        ele1.sendKeys(Keys.ARROW_DOWN);
        ele1.sendKeys(Keys.ARROW_DOWN);
        ele1.sendKeys(Keys.ARROW_DOWN);
        
        WebElement ele2 = driver.findElement(By.xpath("//*[@placeholder=\"Month\"]"));
        ele2.click();
        ele2.sendKeys(Keys.ARROW_DOWN);
        ele2.sendKeys(Keys.ARROW_DOWN);
        ele2.sendKeys(Keys.ARROW_DOWN);
        ele2.sendKeys(Keys.ARROW_DOWN);
        ele2.sendKeys(Keys.ARROW_DOWN);
        ele2.sendKeys(Keys.ARROW_DOWN);
        ele2.sendKeys(Keys.ARROW_UP);
        ele2.sendKeys(Keys.ARROW_UP);
        ele2.sendKeys(Keys.ARROW_UP);
        
        WebElement ele3 = driver.findElement(By.xpath("//*[@placeholder=\"Day\"]"));
        ele3.click();
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_UP);
        robot.keyRelease(KeyEvent.VK_UP);

	}

}
