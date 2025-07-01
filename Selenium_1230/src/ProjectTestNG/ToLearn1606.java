package ProjectTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearn1606 extends BaseClass {
	@Test
	public void giftCards()
	{
		wel=new WelComepage(driver);
		wel.getGiftcardsLink().click();
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Gift Cards","Gift Cards page is not Displayed");
		Reporter.log("Gift Cards is Displayed",true);
	}
	@Test
	public void apparelAndShoes()
	{
		wel=new WelComepage(driver);
		wel.getApparelAndShoesLink().click();
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Apparel & Shoes","Apparel & Shoes is not Displayed");
		Reporter.log("Apparel & Shoes is Dispayed",true);
	}
	@Test
	public void digitalDownloads()
	{
		wel=new WelComepage(driver);
		wel.getDigitalDownloads().click();
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Digital downloads","Digital downloads is not displayed");
		Reporter.log("Digital downloads is displayed",true);
	}
}