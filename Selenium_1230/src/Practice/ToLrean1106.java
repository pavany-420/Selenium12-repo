package Practice;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLrean1106 {
	@Test(priority = 3)
	public void addAccount()
	{ 
		Reporter.log("Running addAccount",true);
	}
	@Test(dependsOnMethods  = "addAccount")
	public void editAccount()
	{
		Reporter.log("Running editAccount",true);
	}
	@Test(dependsOnMethods =  {"addAccount","editAccount"})
	public void deleteAccount()
	{
		Reporter.log("Running deleteAccount",true);
	}
}
