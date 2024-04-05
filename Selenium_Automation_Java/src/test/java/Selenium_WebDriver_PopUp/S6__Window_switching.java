package Selenium_WebDriver_PopUp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S6__Window_switching {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		/*driver.findElement(By.xpath("//button[.=\"    click   \"]")).click();
		
		String main = driver.getWindowHandle();
		System.out.println(main);
		
		Set<String> win = driver.getWindowHandles();
		for (String str : win) 
		{
			if(!main.equals(str)) 
			{
				driver.switchTo().window(str);
			}
			
		}
		
		driver.findElement(By.xpath("//a[.=\"Watch the Videos\"]")).click();
		
		driver.findElement(By.xpath("//a[.=\"Open New Seperate Windows\"]")).click();
		driver.findElement(By.xpath("//button[.=\"click\"]")).click();
		
		String main = driver.getWindowHandle();
		System.out.println(main);
		
		Set<String> win = driver.getWindowHandles();
		for (String str : win) 
		{
			if(!main.equals(str)) 
			{
				driver.switchTo().window(str);
			}
			
		}
		
		driver.findElement(By.xpath("//a[.=\"Watch the Videos\"]")).click();*/
		
		
		//switching windows by window title
		
		//switching to 2nd window
		
		driver.findElement(By.xpath("//a[.=\"Open New Seperate Windows\"]")).click();
		driver.findElement(By.xpath("//button[.=\"click\"]")).click();
		
		Set<String> win = driver.getWindowHandles();
		for (String str : win) 
		{
			driver.switchTo().window(str);
			String title = driver.getTitle();
			System.out.println(title);
			
			if(title.contains("Selenium"))
			{
				break;
			}
			
		}
		
		driver.findElement(By.xpath("//a[.=\"Watch the Videos\"]")).click();
		
		//switching to 3rd window
		
		Set<String> wind = driver.getWindowHandles();
		for (String str : wind) 
		{
			driver.switchTo().window(str);
			String title = driver.getTitle();
			System.out.println(title);
			
			if(title.contains("SeleniumConf Chicago 2023 Playlist - YouTube"))
			{
				break;
			}
			
		}
		
		driver.findElement(By.xpath("(//div[@id=\"meta\"])[1]")).click();
		
		//switching to main window
		
		Set<String> windo = driver.getWindowHandles();
		for (String str : windo) 
		{
			driver.switchTo().window(str);
			String title = driver.getTitle();
			System.out.println(title);
			
			if(title.contains("Frames & windows"))
			{
				break;
			}
			
		}
		
		driver.findElement(By.xpath("//a[.=\"Home\"]")).click();

	}

}
