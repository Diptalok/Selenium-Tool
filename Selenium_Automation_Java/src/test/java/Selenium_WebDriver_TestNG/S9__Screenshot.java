package Selenium_WebDriver_TestNG;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.opentelemetry.api.internal.Utils;
public class S9__Screenshot {
	
	@Test
	public void ss() throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("FailedScript.png");
		FileUtils.copyFile(src, dest);
		
		driver.findElement(By.xpath("//a[.=\"Mobiles\"]")).click();
		
		TakesScreenshot ts1 = (TakesScreenshot)driver;
		File src1 = ts1.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("Failed.png");
		FileUtils.copyFile(src1, dest1);
		
		
	}

}
