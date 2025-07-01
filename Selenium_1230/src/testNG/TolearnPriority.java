package testNG;

import java.rmi.registry.Registry;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TolearnPriority {
	@Test(priority = 2,groups = "smoke")
	public void login()
	{
		Reporter.log("login page is running",true);
	}
	@Test(priority = 1,groups = "regression")
	public void register()
	{
		Reporter.log("register page is running",true);
	}
	
}
