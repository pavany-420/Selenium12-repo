package Practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import webdriver.ToLearnGetCurrentUrl;

public class ToLearn0805 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		
		driver.findElement(By.xpath("//a[text()='Vtiger']")).click();
		switchToWindow(driver, " CRM Software: Customer");
		driver.findElement(By.id("loginspan")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("wow@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		Thread.sleep(2000);
	System.out.println(driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getCssValue("color"));
		
	System.out.println(driver.findElement(By.xpath("//button[text()='Sign in']")).getCssValue("background-color"));
		
	
	}
	public static void switchToWindow(WebDriver driver,String actTitle)
	{
		Set<String> allWindowsIds = driver.getWindowHandles();
		for(String id: allWindowsIds) {
			driver.switchTo().window(id);
		String title = driver.getTitle();
		if(title.contains(actTitle))
			break;
		}
	}
}
