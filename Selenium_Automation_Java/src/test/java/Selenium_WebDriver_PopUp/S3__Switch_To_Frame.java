package Selenium_WebDriver_PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class S3__Switch_To_Frame {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://jqueryui.com/droppable/");
		//driver.get("https://demo.automationtesting.in/Frames.html");
		//driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// 1. switch to frame by index
	    //driver.switchTo().frame(0);
		//driver.switchTo().frame(1);
		//driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).sendKeys("miku");
		
		// 2. switch to frame by id attribute (name attribute also)
		//driver.switchTo().frame("SingleFrame");
		//driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).sendKeys("miku");
		
		// 3. switch to frame by frame webelement
		/*WebElement frame_name = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(frame_name);
	    
		Thread.sleep(1000);
		WebElement drag = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		Thread.sleep(1000);
		WebElement drop = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).perform();
		
		WebElement ele = driver.findElement(By.xpath("(//iframe)[2]"));
		driver.switchTo().frame(ele);
		driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).sendKeys("miku");
		
		WebElement elf = driver.findElement(By.xpath("(//iframe[@id=\"frm1\"])[1]"));
		driver.switchTo().frame(elf);
		WebElement ele = driver.findElement(By.xpath("//li[.=\"Single-Selection Dropdown\"]"));
		System.out.println(ele.getText());
		
		driver.switchTo().parentFrame();
		WebElement elf1 = driver.findElement(By.xpath("(//iframe[@id=\"frm2\"])[1]"));
		driver.switchTo().frame(elf1);
		WebElement ele1 = driver.findElement(By.xpath("//li[.=\"Textbox\"]"));
		System.out.println(ele1.getText());*/
		
		driver.switchTo().frame("frame-top");
		
		Actions act = new Actions(driver);
		act.doubleClick().perform();
		
		driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-bottom");
		
		Actions act1 = new Actions(driver);
		act1.doubleClick().perform();
		


	}

}
