package test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Test {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("password")).clear();
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./ScreenShots/Test.png");
		FileHandler.copy(temp, dest);
		
		driver.findElement(By.linkText("Vtiger")).click();
		switchToWindow(driver, "CRM Software: Customer Relationship Management | Vtiger CRM");
	
		
		Actions act=new Actions(driver);
		WebElement ele = driver.findElement(By.id("companyDropdown"));
		act.pause(3000).moveToElement(ele).perform();
		//Select sec=new Select(driver.findElement(By.id("companyDropdown")));
		//sec.selectByIndex(3);
		//driver.findElement(By.id("companyDropdown")).click();
	      driver.findElement(By.linkText("Contact Us")).click();
		System.out.println(driver.findElement(By.xpath("//p[contains(text(),'Bengaluru')]/..//p[2]")).getText());
		
		
		
	}
	public static void switchToWindow(WebDriver driver,String exp)
	{
		Set<String> allWindowids = driver.getWindowHandles();
		for(String id:allWindowids)
		{
			driver.switchTo().window(id);
			String url = driver.getTitle();
			if(url.contains(exp)) {
				break;
			}
				
		}
	}
}
