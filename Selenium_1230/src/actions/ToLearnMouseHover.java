package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnMouseHover {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.vtiger.com/");
		
		//WebElement features = driver.findElement(By.partialLinkText("Features"));
		Actions act=new Actions(driver);
		//act.moveToElement(features).perform();
		//WebElement auto = driver.findElement(By.partialLinkText("Sales Automation"));
		//act.moveToElement(auto).perform(); 
		act.moveByOffset(395, 100).perform();
	}
}
