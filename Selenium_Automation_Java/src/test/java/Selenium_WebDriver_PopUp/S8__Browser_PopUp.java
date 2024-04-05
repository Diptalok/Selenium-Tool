package Selenium_WebDriver_PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class S8__Browser_PopUp {

	public static void main(String[] args) {
		ChromeOptions opt1 = new ChromeOptions();
		opt1.addArguments("--disable-notifications");
		WebDriver driver1 = new ChromeDriver(opt1);
		driver1.get("https://www.irctc.co.in/nget/train-search");
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//launching private browser 
		ChromeOptions opt2 = new ChromeOptions();
		opt2.addArguments("incognito");
		WebDriver driver2 = new ChromeDriver(opt2);
		driver2.get("https://www.irctc.co.in/nget/train-search");
		driver2.manage().window().maximize();
		driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		EdgeOptions opt3 = new EdgeOptions();
		opt3.addArguments("InPrivate");
		WebDriver driver3 = new EdgeDriver(opt3);
		driver3.get("https://www.irctc.co.in/nget/train-search");
		driver3.manage().window().maximize();
		driver3.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		FirefoxOptions opt4 = new FirefoxOptions();
		opt4.addArguments("-private");
		WebDriver driver4 = new FirefoxDriver(opt4);
		driver4.get("https://www.irctc.co.in/nget/train-search");
		driver4.manage().window().maximize();
		driver4.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		

	}

}
