package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnAbhiBus {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.abhibus.com/bus-ticket-offers");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,4000) ");
		driver.findElement(By.partialLinkText("Hyderabad to Bangalore Bus")).click();
		driver.findElement(By.xpath("//div[text()='Bus Partner']")).click();
		driver.findElement(By.xpath("//label[text()='Go Tour Travels and Holidays']/..//input[@type='checkbox']")).click();
		List<WebElement> allPrice = driver.findElements(By.xpath("//div[@class='container  ']/..//span[@class='fare text-neutral-700']"));
		for(WebElement ele:allPrice)
		{
			String price = ele.getText();
			System.out.println(price);
		}
	}
}
