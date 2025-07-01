package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearn0705 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.clear();
		username.sendKeys("Selenium");
		WebElement password = driver.findElement(By.xpath("//input[@id=\"password\"]"));
		password.clear();
		password.sendKeys("test@1234");
		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
	}
}
