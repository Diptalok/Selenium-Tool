package Selenium_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class S4__WebDriver_Methods {

	public static void main(String[] args) throws InterruptedException {
		
		/*WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.co.in/");
				
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/");*/

		//launching the browser
		WebDriver driver=new ChromeDriver();
		
		//1. getUrl() ---> launching web the application in browser
		driver.get("https://seleniumbase.io/demo_page");
		
		//2. getTitle() ---> fetches the title of web page
		String title = driver.getTitle();
		System.out.println(title);
		
		//3. getCurrentUrl() ---> fetches the current url of webpage
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//4. manage() ---> option method having methods to
		
		//maximize the window
		Thread.sleep(5000);
		driver.manage().window().maximize();
		//minimize the window
		//driver.manage().window().minimize();
		
		//5. getPageSource() ---> to get the source code of the web page of web app
		String page_source=driver.getPageSource();
		System.out.println(page_source);
		
		//6. findElement() ---> locate the web element in a web page
		Thread.sleep(5000);
		driver.findElement(By.id("myTextInput")).sendKeys("Miku");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"myTextInput2\"]")).sendKeys("delete text");
		Thread.sleep(5000);
		driver.findElement(By.name("linkName2")).click();
		
		//7. navigate() ---> move to backward or forward or refresh
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		
		//8. close() ---> to close the driver focused current window
		Thread.sleep(5000);
		driver.close();
		
		//9. quit() ---> closes all the windows
		driver.quit();
	}

}
