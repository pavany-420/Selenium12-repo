package miniproject;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookRegisterPage {
	@FindBy(name="firstname")
	private WebElement firstNameTextField;
	@FindBy(name="lastname")
	private WebElement lastNameTextField;
	@FindBy(id="day")
	private WebElement dayRadioButton;
	@FindBy(id="month")
	private WebElement monthRadioButton;
	@FindBy(id="year")
	private WebElement yearRadioButton;
	@FindBy(xpath = "//label[text()='Female']/..//input[@id='sex']")
	private WebElement femaleRadioButton;
	@FindBy(xpath = "//label[text()='Male']/..//input[@id='sex']")
	private WebElement maleRadioButton;
	@FindBy(xpath = "//label[text()='Custom']/..//input[@id='sex']")
	private WebElement customRadioButton;
	@FindBy(xpath = "//input[@name='reg_email__']")
	private WebElement EmailOrPhoneNoTextField;
	@FindBy(xpath = "//input[@id='password_step_input']")
	private WebElement passwordTextField;
	@FindBy(xpath = "(//button[text()='Sign Up'])[1]")
	private WebElement signInButton;
	
	public FaceBookRegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getDayRadioButton() {
		return dayRadioButton;
	}

	public WebElement getMonthRadioButton() {
		return monthRadioButton;
	}

	public WebElement getYearRadioButton() {
		return yearRadioButton;
	}

	public WebElement getFemaleRadioButton() {
		return femaleRadioButton;
	}

	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}

	public WebElement getCustomRadioButton() {
		return customRadioButton;
	}

	public WebElement getEmailOrPhoneNoTextField() {
		return EmailOrPhoneNoTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getSignInButton() {
		return signInButton;
	}
	
	
}
