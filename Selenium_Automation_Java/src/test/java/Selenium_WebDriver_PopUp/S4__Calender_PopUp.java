package Selenium_WebDriver_PopUp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S4__Calender_PopUp {

	public static void main(String[] args) throws InterruptedException  {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//div[@class=\"flt_fsw_inputBox dates inactiveWidget \"]")).click();
		
		String str = "February 2024";
		int date = 15;
		
		driver.findElement(By.xpath("(//div[.=\""+str+"\"])[2]/ancestor::div[@class=\"DayPicker-Month\"]"
				+ "/descendant::p[text()=\""+date+"\"]")).click();
		
		/*String str1 = "February 2024";
		int date1 = 15;
		driver.findElement(By.xpath("(//div[.=\""+str1+"\"])[2]"
				+ "/ancestor::div[@class=\"DayPicker-Month\"] /descendant::p[text()=\""+date1+"\"]")).click();
		*/
		driver.findElement(By.xpath("//p[@class=\"latoBlack font12 greyText lineHeight16\"]")).click();
		
		driver.findElement(By.xpath("//div[2][@class=\"DayPicker-Month\"]/descendant::p[.=\"28\"]")).click();
		
		WebElement ele = driver.findElement(By.xpath("//input[@id=\"fromCity\"]"));
		ele.sendKeys("chenn");
		Thread.sleep(3000);
		ele.sendKeys(Keys.DOWN);
		Thread.sleep(2000);
		ele.sendKeys(Keys.ENTER);
		
		List<WebElement> sugg = driver.findElements(By.xpath("//div[@class=\"react-autosuggest__section-container react-autosuggest__"
				+ "section-container--first\"]"));
		
		for (WebElement sug : sugg) {
			Thread.sleep(2000);
			String str2=sug.getText();
			System.out.println(str2);
			Thread.sleep(2000);
			if(str2.contains("Chennai, India\r\n"
					+ "Chennai International Airport\r\n"
					+ "MAA")) {
				sug.click();
				break;
			}
		}
		
		//driver.findElement(By.xpath("//ul[@class=\"react-autosuggest__suggestions-list\"]"
			//	+ "/descendant::p[.=\"Chennai, India\"]")).click();

	}

}
