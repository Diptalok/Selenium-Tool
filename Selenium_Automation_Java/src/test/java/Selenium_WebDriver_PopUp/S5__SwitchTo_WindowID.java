package Selenium_WebDriver_PopUp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class S5__SwitchTo_WindowID {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement ele = driver.findElement(By.xpath("//div[.=\"Jobs\"]"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[.=\"Jobs by skill\"]")).click();
		Thread.sleep(1000);
		WebElement elem = driver.findElement(By.xpath("//div[.=\"Jobs\"]"));
		act.moveToElement(elem).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[.=\"Jobs by Skill\"])[1]")).click();
		Thread.sleep(1000);
		String mainid = driver.getWindowHandle();
		System.out.println(mainid);
		Thread.sleep(1000);
		Set<String> winds = driver.getWindowHandles();
		for (String win : winds) {
			if(!mainid.equals(win)) {
				driver.switchTo().window(win);
				driver.findElement(By.xpath("//a[.=\"Walk-in Jobs\"]")).click();
			}
		}
		driver.switchTo().window(mainid);
		driver.findElement(By.xpath("//span[.=\"Later\"]")).click();
		driver.findElement(By.xpath("(//a[.=\"International Jobs\"])[2]")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Set<String> winids = driver.getWindowHandles();
		for (String str : winids) 
		{
			System.out.println(str);
			Thread.sleep(1000);
			if(!mainid.equals(str))
			{
				Thread.sleep(1000);
				driver.switchTo().window(str);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//a[.=\"Walk-in Jobs\"]")).click();
			}
		}
		
			driver.switchTo().window(mainid);
			driver.findElement(By.xpath("//span[.=\"Later\"]")).click();
			driver.findElement(By.xpath("(//a[.=\"International Jobs\"])[2]")).click();*/
				
	}

}
