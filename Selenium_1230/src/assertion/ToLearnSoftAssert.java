package assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ToLearnSoftAssert {
	@Test
	public void login()
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(driver.getTitle(), "Demo Web Shop. Log","Login Page Not displayed");
		
		driver.findElement(By.id("Email")).sendKeys("wowo123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("eEL!Dsw7w6jgUJ");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		soft.assertEquals(driver.getTitle(), "Demo Web ","Home Page is not Displayed");
		
		soft.assertAll();
		
	}
}