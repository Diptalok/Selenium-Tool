package Selenium_WebDriver_TestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class T2__Assignment {
    
	@Test
	public void text() {
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.bigbasket.com/");
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        WebElement ele = driver.findElement(By.xpath("(//input[@placeholder=\"Search for Products...\"])[2]"));
        ele.sendKeys("Watermelon");
        List<WebElement> allsugg = driver.findElements(By.xpath("//ul[@class=\"overscroll-contain\"]"));
        for (WebElement sugg : allsugg) 
        {
        	System.out.println(sugg.getText());
			
		}
        ele.sendKeys(Keys.ENTER);
        
        String wm_name = driver.findElement(By.xpath("//h3[.=\"Watermelon  - Small\"]")).getText();
        System.out.println(wm_name);
        
        /*String wm_price = driver.findElement(By.xpath("//span[.=\"₹97.09\"]")).getText();
        System.out.println(wm_price);
        
        List<WebElement> wm = driver.findElements(By.xpath("//span[@class=\"Label-sc-15v1nk5-0 QuickSearch___StyledLabel2-sc-rtz2vl-7 gJxZPQ gFDEBU\"]"));
        for (WebElement web : wm)
        {
        	String str = web.getText();
        	System.out.println(str);
        	if(str.contains("Green Watermelon Fruit Seeds")) 
        	{
        		web.click();  
        		break;
        	}     	
		}
        
        List<WebElement> wm1 = driver.findElements(By.xpath("//span[@class=\"Label-sc-15v1nk5-0 QuickSearch___StyledLabel4-sc-rtz2vl-9 gJxZPQ gpRcpM\"]"));
        for (WebElement web : wm1)
        {
        	String str = web.getText();
        	System.out.println(str);
		}*/

	}

}
