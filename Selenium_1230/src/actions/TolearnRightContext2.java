package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TolearnRightContext2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demo.guru99.com/test/simple_context_menu");
		WebElement elementRightClick = driver.findElement(By.xpath("//span[text()='right click me']")); 
	Actions act=new Actions(driver);
		act.contextClick(elementRightClick).perform();
		driver.findElement(By.xpath("//span[text()='Copy']")).click();
	}
}
