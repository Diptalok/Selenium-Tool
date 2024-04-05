package POM_Repository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Print {
	public Amazon_Print(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@type=\"text\"]")
	private WebElement search_bar;

	public WebElement getSearch_bar() {
		return search_bar;
	}

	public void setSearch_bar(WebElement search_bar) {
		this.search_bar = search_bar;
	}

    @FindBy(xpath="//span[@class=\"a-size-medium a-color-base a-text-normal\"]")
    private List<WebElement> allmob;

	public List<WebElement> getAllmob() {
		return allmob;
	}

	public void setAllmob1(List<WebElement> allmob) {
		this.allmob = allmob;
	}
    
	@FindBy(xpath="//span[@class=\"a-price-whole\"]")
	private List<WebElement> allpr;

	public List<WebElement> getAllpr() {
		return allpr;
	}

	public void setAllpr(List<WebElement> allpr) {
		this.allpr = allpr;
	}
    

	
	  
    
    
	
	
}
