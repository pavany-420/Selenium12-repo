package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToLearnGetWindowHandles {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.shoppersstack.com/products_page/23");
		Thread.sleep(20000);

		driver.findElement(By.id("compare")).click();

		Set<String> allWindowIDs = driver.getWindowHandles();
		System.out.println(allWindowIDs);
		for(String s:allWindowIDs)
		{
			System.out.println(s);
		}
		driver.quit();

	}
}
