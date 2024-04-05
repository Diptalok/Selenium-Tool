package POM_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn {
	
	//initialisation
	public LogIn (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//declaration
	@FindBy(id="user-name")
	private WebElement UserNameTextField;
	
	@FindBy (name="password")
	private WebElement PasswordField;
	
	@FindBy (className="btn_action")
	private WebElement LogInButton;

	public WebElement getUserNameTextField() {
		return UserNameTextField;
	}

	public void setUserNameTextField(WebElement userNameTextField) {
		UserNameTextField = userNameTextField;
	}

	public WebElement getPasswordField() {
		return PasswordField;
	}

	public void setPasswordField(WebElement passwordField) {
		PasswordField = passwordField;
	}

	public WebElement getLogInButton() {
		return LogInButton;
	}

	public void setLogInButton(WebElement logInButton) {
		LogInButton = logInButton;
	}
	
	//Business logic
	public void logintoApp(String username, String password) {
		UserNameTextField.sendKeys(username);
		PasswordField.sendKeys(password);
		LogInButton.click();
	}

}
