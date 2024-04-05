package Selenium_WebDriver;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class T7__WebElement_Method {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	    //WebElement methods are used to perform action in the web page
		//1. getCssValue() - used to get css value of web element
		
		WebElement logo = driver.findElement(By.xpath("//img[contains(@class,\"fb\")]"));
        String size = logo.getCssValue("font-size");
        String colour=logo.getCssValue("color");
		System.out.println(size);
		System.out.println(colour);
		
		//2. getSize() - used to get height and width of a web element
		
		Dimension dimension = logo.getSize();
		System.out.println(dimension);
		System.out.println(dimension.getHeight());
		System.out.println(dimension.getWidth());
		
		//3. getLocation() - is used to get the location of web element
		
		WebElement location = driver.findElement(By.xpath("//*[contains(text(),\"ଓଡ଼ିଆ\")]"));
		Point loc = location.getLocation();
		System.out.println(loc.getX());
		System.out.println(loc.getY());
		
		//4. getRect() - is combination of getSize() and getLocation()
		
		WebElement element = driver.findElement(By.xpath("//*[contains(text(),\"Create new account\")]"));
		Rectangle el = element.getRect();
		System.out.println(dimension);
		System.out.println(el.getPoint());  //to get x and y
		System.out.println(el.getX());
		System.out.println(el.getY());
		System.out.println(el.getHeight());
		System.out.println(el.getWidth());
		
		//5. sendkeys() is used to give some user input or value to the web page
		//6. clear() is used to clear the given input
		
		Thread.sleep(2000);
		driver.navigate().to("https://www.saucedemo.com/v1/");
		WebElement username = driver.findElement(By.xpath("//*[@data-test=\"username\"]"));
		username.sendKeys("Miku");
		Thread.sleep(2000);
		username.clear();
        
		
		//7. submit() is used to submit the given input to the search bar
		
		Thread.sleep(2000);
		driver.navigate().to("https://www.amazon.in/");
		WebElement search = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		search.sendKeys("Adidas");
		Thread.sleep(1000);
		search.submit();
		
		Thread.sleep(2000);
		driver.navigate().to("https://www.saucedemo.com/v1/");
		
		//submit also works here but it usually doesn't work in every submit place
		//so in that place we can use 
		//8. click() method
		
		driver.findElement(By.xpath("//input[contains(@type,\"xt\")]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[contains(@type,\"p\")]")).sendKeys("secret_sauce");
		//driver.findElement(By.xpath("//input[contains(@value,\"LOG\")]")).submit();
		driver.findElement(By.xpath("//input[contains(@value,\"LOG\")]")).click();
		
		//9. isEnabled() is used to see whether that web element is enabled to be used in the web page or not
		
		driver.navigate().to("https://www.amazon.in/");
		WebElement sbox = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		if (sbox.isEnabled()) {
			sbox.sendKeys("nike");
		}
		
		//10. isDisplayed() is used to see whether that web element is present in the web page or not
		
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/");
		WebElement log = driver.findElement(By.xpath("//*[@class=\"fb_logo _8ilh img\"]"));
		if (log.isDisplayed()) {
			System.out.println("logo is displayed");
		}
		
		WebElement sign = driver.findElement(By.xpath("//a[.=\"Sign Up\"]"));
		sign.click();
		
		//11. isSelected() is used to see whether that web element is selected in the web page or not
		
		WebElement radiob = driver.findElement(By.xpath("(//*[@type=\"radio\"])[1]"));
		radiob.click();
		
		Thread.sleep(2000);
		if(radiob.isSelected()) {
			System.out.println("radio button is selected");
		}
		else {
			System.out.println("radio button is not selected");
		} 
		
		System.out.println("");
		
		//12. Other methods
		
		System.out.println(radiob.getAccessibleName());
		System.out.println(radiob.getAriaRole());
		System.out.println(radiob.getText());
		System.out.println(radiob.getTagName());
		System.out.println(radiob.getAttribute("class"));
		System.out.println(radiob.getDomAttribute("class"));
		System.out.println(radiob.getDomProperty("class"));
		
	}
}