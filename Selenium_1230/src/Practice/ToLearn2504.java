package Practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearn2504 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/products_page/23");
		
		Thread.sleep(15000);
		
		driver.findElement(By.id("compare")).click();
		
		
		switchToWindow(driver, "amazon");
	     String title = driver.getTitle();
	     System.out.println(title);
	     switchToWindow(driver, "ebay");
	              driver.close();
	     
		
		
	}
	public static void switchToWindow(WebDriver driver,String expurl)
	{
		Set<String> allWindowIDs = driver.getWindowHandles();
		for(String id:allWindowIDs)
		{
			driver.switchTo().window(id);
			String acturl = driver.getCurrentUrl();
			if(acturl.contains(expurl))
				break;
		}
	}
}
