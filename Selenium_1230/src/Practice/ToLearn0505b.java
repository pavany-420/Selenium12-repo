package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearn0505b {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Train Tickets']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Live train status']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'SWTANTRTA')]/../..//button[text()='Show Availability']")).click();
		
	}
}
