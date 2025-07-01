package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TolearnIFrame {
	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		 driver.get("https://www.dream11.com/");
		// driver.switchTo().frame(0);
		// driver.switchTo().frame("send-sms-iframe");
		WebElement elements = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
		 driver.switchTo().frame(elements);
		 driver.findElement(By.id("regEmail")).sendKeys("2012210002:");
		 driver.findElement(By.id("regUser")).click();
		// driver.switchTo().parentFrame();
		 driver.switchTo().defaultContent(); 
		 driver.findElement(By.id("hamburger")).click();
	}
}
