package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TolearnInvocationcount {
	@Test (invocationCount = 3,threadPoolSize = 2,groups = "regression")
	public void login()
	{
		WebDriver driver=new FirefoxDriver();
		Reporter.log("Empty bro",true);
	}
}
