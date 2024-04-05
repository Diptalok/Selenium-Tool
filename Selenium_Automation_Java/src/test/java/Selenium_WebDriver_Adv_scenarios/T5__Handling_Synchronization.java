package Selenium_WebDriver_Adv_scenarios;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.dockerjava.api.command.WaitContainerCmd;
public class T5__Handling_Synchronization {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        
        //java wait
        //Exception - NoSuchElementException
        Thread.sleep(1000);
        
        //Implicit wait
        //Exception - NoSuchElementException
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
               
        WebElement account = driver.findElement(By.xpath("//a[text()=\"Create new account\"]"));
        
        //Explicit wait
        //Exception - TimeOutException
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(account));
        account.click();
        
        //Fluent wait
        //Exception - TimeOutException
        WebElement day = driver.findElement(By.xpath("//*[@aria-label=\"Day\"]"));
        FluentWait wait1 = new FluentWait(driver);
        wait1.pollingEvery(Duration.ofSeconds(1));
        wait1.withTimeout(Duration.ofSeconds(10));
        wait1.until(ExpectedConditions.elementToBeClickable(day));
        day.click();
        
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
        
        WebElement year = driver.findElement(By.xpath("//*[@aria-label=\"Year\"]"));
        year.click();
        Robot robot = new  Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        
	}

}
