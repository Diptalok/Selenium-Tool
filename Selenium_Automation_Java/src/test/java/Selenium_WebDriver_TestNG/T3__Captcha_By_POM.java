package Selenium_WebDriver_TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import POM_Repository.Captcha;
import net.sourceforge.tess4j.Tesseract;

public class T3__Captcha_By_POM {

	@Test
	public void cap() throws Exception {
		ChromeOptions op= new ChromeOptions();
		op.addArguments("--disable-notifications");
		//op.addArguments("incognito");
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		File file = new File("./testData/data.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		String URL = prop.getProperty("url1");
		driver.get(URL);
		Captcha cpt = new Captcha(driver);
		cpt.getBox().click();
		cpt.getLog().click();
		WebElement CAPTCHA = cpt.getCap();
		TakesScreenshot ts = (TakesScreenshot)CAPTCHA;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./captchaPOMscreenshot.png");
		FileUtils.copyFile(src, dest);
		Tesseract tss= new Tesseract();
		tss.setDatapath("C:\\Users\\dipta\\Downloads\\Tess4J-3.4.8-src\\Tess4J\\tessdata");
		String st = tss.doOCR(dest);
		String img = st.replaceAll(" ", "");
		cpt.getCapsub().sendKeys(img);
		
	}

}
