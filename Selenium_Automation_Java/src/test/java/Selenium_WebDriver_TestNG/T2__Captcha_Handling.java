package Selenium_WebDriver_TestNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import net.sourceforge.tess4j.Tesseract;
/*import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.TesseractException;
import net.sourceforge.lept4j.Pix;*/


public class T2__Captcha_Handling {

	@Test
	public void cap() throws Exception {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("(//i[@class=\"fa fa-align-justify\"])[1]")).click();
		WebElement Log = driver.findElement(By.xpath("//button[.=\"LOGIN\"]"));
		Log.click();
		WebElement captcha = driver.findElement(By.xpath("//img[@class=\"captcha-img\"]"));
		TakesScreenshot ts = (TakesScreenshot)captcha;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./capscreenshot.png");
		FileUtils.copyFile(src,dest);
		Tesseract tss = new Tesseract();
		tss.setDatapath("C:\\Users\\dipta\\Downloads\\Tess4J-3.4.8-src\\Tess4J\\tessdata");
		String cap = tss.doOCR(dest);
		String f_cap = cap.replaceAll(" ", "");
		driver.findElement(By.xpath("//input[@id=\"captcha\"]")).sendKeys(f_cap);
		
	}

}
