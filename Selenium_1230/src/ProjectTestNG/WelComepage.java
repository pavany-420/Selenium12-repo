package ProjectTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelComepage {
	@FindBy(partialLinkText = "GIFT CARDS")
	private WebElement giftcardsLink;
	@FindBy(partialLinkText = "APPAREL & SHOES")
	private WebElement apparelAndShoesLink;
	@FindBy(partialLinkText = "DIGITAL DOWNLOADS")
	private WebElement digitalDownloads;
	@FindBy(linkText = "Log in")
	private WebElement loginLink;
	
	public WelComepage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public WebElement getGiftcardsLink() {
		return giftcardsLink;
	}

	public WebElement getApparelAndShoesLink() {
		return apparelAndShoesLink;
	}

	public WebElement getDigitalDownloads() {
		return digitalDownloads;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}
	
	
	
}
