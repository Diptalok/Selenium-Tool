package POM_Repository;

import java.util.List;

import org.apache.commons.compress.harmony.pack200.IntList;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart_Print {
	public Flipkart_Print(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(name="q")
    private WebElement search;
	
	@FindBy (xpath="//div[@class=\"_4rR01T\"]")
	private List<WebElement> allmob;
	
	@FindBy (xpath="//div[@class=\"_30jeq3 _1_WHN1\"]")
	private List<WebElement> allprice;

	public List<WebElement> getAllprice() {
		return allprice;
	}

	public void setAllprice(List<WebElement> allprice) {
		this.allprice = allprice;
	}

	public WebElement getSearch() {
		return search;
	}

	public void setSearch(WebElement search) {
		this.search = search;
	}

	public List<WebElement> getAllmob() {
		return (List<WebElement>) allmob;
	}

	public void setAllmob(List<WebElement> allmob) {
		this.allmob = allmob;
	}
	
	public void logintoApp(String str){
		search.sendKeys(str,Keys.ENTER);
		for (WebElement ele : allmob) {
			System.out.println(ele.getText());
		}
		for (WebElement ele : allprice) {
			System.out.println(ele.getText());
		}
	}
	
	
	

}
