package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnScrolling {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://ksrtc.in/");
		WebElement dest = driver.findElement(By.xpath("//a[text()='About Us']"));
		Actions act=new Actions(driver);
		act.scrollToElement(dest).perform();
		//act.scrollByAmount(760, 60).perform();
	}
}
