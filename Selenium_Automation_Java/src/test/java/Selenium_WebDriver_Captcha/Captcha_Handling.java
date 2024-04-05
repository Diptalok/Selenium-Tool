package Selenium_WebDriver_Captcha;

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

public class Captcha_Handling {

	
	public static void main(String[] arg) throws Exception {
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
		File dest = new File("./captchaScreenshot.png");
		FileUtils.copyFile(src, dest);
		Tesseract tss = new Tesseract();
		tss.setDatapath("C:\\Users\\dipta\\Downloads\\Tess4J-3.4.8-src\\Tess4J\\tessdata");
		String text_from_img = tss.doOCR(dest);
		System.out.println(text_from_img);
		String final_Captcha = text_from_img.replaceAll(" ", "");
		System.out.println(final_Captcha);
		driver.findElement(By.xpath("//input[@id=\"captcha\"]")).sendKeys(final_Captcha);
		
	}
	
}



/*
Tesseract tss = new Tesseract();
tss.setDatapath("path where Tess4j is present in local");
String text_from_img = tss.doOCR(screenshot of captcha);
System.out.println(text_from_img);
String final_Captcha = text_from_img.replaceAll(" ", "");
System.out.println(final_Captcha);
driver.findElement(By.xpath("//input[@id=\"captcha\"]")).sendKeys(final_Captcha);
*/