package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToLearnStaleElementExp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.myntra.com/");
//		
//		WebElement ele = driver.findElement(By.xpath("//input[contains(@placeholder,'Search for products')]"));
//		ele.sendKeys("shoes");
//		driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
//		ele.sendKeys("shirts");
		
		MyntraWelComePage wl=new MyntraWelComePage(driver);
		wl.getSearchTextField().sendKeys("Shoes");
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
		Thread.sleep(2000);
		wl.getSearchTextField().sendKeys("Shirts",Keys.ENTER);
	}
}
