package Practice;

import java.awt.print.PageFormat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookLogin {
	@FindBy(id="email")
	private WebElement emailOrPhoneNoTextField;
	@FindBy(id="pass")
	private WebElement passwordTextField;
	@FindBy(name="login")
	private WebElement loginButton;
	
	public FaceBookLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmailOrPhoneNoTextField() {
		return emailOrPhoneNoTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
}
