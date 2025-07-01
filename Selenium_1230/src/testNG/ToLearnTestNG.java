package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnTestNG { //testNgClass
	@Test
	public void sample()//test case
	{
		Reporter.log("sample test case executed",true );//test steps
	}
	@Test
	public void demo()//test case
	{
		Reporter.log("demo test case executed",true );//test steps
	}
	
}
