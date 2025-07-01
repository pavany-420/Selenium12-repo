package Practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwap {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/products_page/23");
		Thread.sleep(12000);
		driver.findElement(By.id("compare")).click();
		
		switchToWindow(driver, "flipkart");
		Point pos1 = driver.manage().window().getPosition();
		
		switchToWindow(driver, "ebay");
		Point pos2 = driver.manage().window().getPosition();
		driver.manage().window().setPosition(pos1);
		
		switchToWindow(driver, "flipkart");
		driver.manage().window().setPosition(pos2);
		
		
		
	}
	public static void switchToWindow(WebDriver driver, String expurl)
	{
		Set<String> allWindowIDs = driver.getWindowHandles();
		for(String id: allWindowIDs)
		{
			driver.switchTo().window(id);
			String acturl = driver.getCurrentUrl();
			if(acturl.contains(expurl))
				break;
		}
	}
}
