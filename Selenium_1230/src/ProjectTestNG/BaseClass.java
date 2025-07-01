package ProjectTestNG;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	 public static WebDriver driver;
	 
	 public fileUtility fis=new fileUtility();
	 
	 public WelComepage wel;
	 public LoginPage log;
	 
	@BeforeClass
	public void openBrowser() throws IOException
	{
		
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(fis.getDatafromPropertyFile("url"));
		
		
	}
	 
	@BeforeMethod
	public void login() throws IOException 
	{
		wel=new WelComepage(driver);
		wel.getLoginLink().click();
		log=new LoginPage(driver);
		log.getEmailTextField().sendKeys(fis.getDatafromPropertyFile("username"));
		log.getPasswordTextField().sendKeys(fis.getDatafromPropertyFile("password"));
		log.getLoginButton().click();
	}
	@AfterMethod
	public void logout()
	{
		log =new LoginPage(driver);
		log.getLogoutlink().click();
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
}
