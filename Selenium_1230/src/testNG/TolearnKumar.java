package testNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TolearnKumar extends BaseClass {
	@Test
	public void clickOnBooks()
	{
		driver.findElement(By.partialLinkText("BOOKS")).click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Books","Home Page Is Not Displayed");
		Reporter.log("Home Page is Displayed");
	}
}
