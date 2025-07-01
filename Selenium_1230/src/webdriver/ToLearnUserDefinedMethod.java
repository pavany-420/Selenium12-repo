package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnUserDefinedMethod {
    public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/products_page/23");
		
		Thread.sleep(10000);
		driver.findElement(By.id("compare")).click();
		
		
        switchToWindow(driver, "flipkart");
		Point flposition = driver.manage().window().getPosition();
		
		switchToWindow(driver, "ebay");
		Point ebposition = driver.manage().window().getPosition();
		System.out.println(flposition);
		System.out.println(ebposition);
		
		driver.manage().window().setPosition(flposition);
		ToLearnUserDefinedMethod.switchToWindow(driver, "flipkart");
		driver.manage().window().setPosition(ebposition);
		
		
		
		
			
		
	}
    public static void switchToWindow(WebDriver driver,String expurl)
	{
		Set<String> allwindowsIDs = driver.getWindowHandles();
		
		for(String id:allwindowsIDs)
		{
			driver.switchTo().window(id);
			String acturl = driver.getCurrentUrl();
			if(acturl.contains(expurl))
				break;
			
		}
	}
}
