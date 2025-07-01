package dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

 public class ToLearn1706 {
	@Test(dataProviderClass = DataStorage1.class,dataProvider = "register")
	public void register(String[] cred)
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/register");
		
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys(cred[0]);
		driver.findElement(By.id("LastName")).sendKeys(cred[1]);
		driver.findElement(By.id("Email")).sendKeys(cred[2]);
		driver.findElement(By.id("Password")).sendKeys(cred[3]);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(cred[4]);
		driver.findElement(By.id("register-button")).click();
		
	}
}
