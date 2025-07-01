package assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnHardAssert {
	@Test
	public void login()
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Login","Login Page Not displayed");
		Reporter.log("LoginPage Is Displayed",true);
		
		driver.findElement(By.id("Email")).sendKeys("wowo123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("eEL!Dsw7w6jgUJ");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop", "Home Page is not Displayed");
		Reporter.log("Home Page is Displayed",true);
		
		
	}
}
