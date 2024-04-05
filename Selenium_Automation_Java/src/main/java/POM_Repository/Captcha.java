package POM_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Captcha {
	
	public Captcha (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//i[@class=\"fa fa-align-justify\"])[1]")
	private WebElement box;
	
	@FindBy(xpath="//button[.=\"LOGIN\"]")
	private WebElement log;
	
	@FindBy(xpath="//img[@class=\"captcha-img\"]")
	private WebElement cap;
	
	@FindBy(xpath="//input[@id=\"captcha\"]")
	private WebElement capsub;

	public WebElement getCapsub() {
		return capsub;
	}

	public WebElement getBox() {
		return box;
	}

	public WebElement getLog() {
		return log;
	}

	public WebElement getCap() {
		return cap;
	}


}
