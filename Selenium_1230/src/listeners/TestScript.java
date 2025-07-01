package listeners;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(ListenerImplimentation.class)
public class TestScript extends BaseClass {
	@Test
	public void login()
	{
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("wowo123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("hey@1232");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop","Home Page Is Not Displayed");
		Reporter.log("Home page is displayed",true);
	}
}
