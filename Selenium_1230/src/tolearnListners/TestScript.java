package tolearnListners;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerImplimentaion.class)
public class TestScript extends BaseClass {
	@Test
	public void clickOnBook()
	{
		driver.findElement(By.partialLinkText("BOOKS")).click();
		
	}
	
	@Test
	public void clickOnComputers()
	{
		driver.findElement(By.partialLinkText("COMPUTERs")).click();
		
	}
	
	@Test
	public void clickOnElectrols()
	{
		driver.findElement(By.partialLinkText("ELECTRONICS")).click();
		
	}
}
