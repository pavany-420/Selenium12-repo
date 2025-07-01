package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearn0505 {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.xpath("//input[@autofocus='autofocus']")).sendKeys("wowo123@gmail.com");
		driver.findElement(By.xpath("//input[@class='password']")).sendKeys("eEL!Dsw7w6jgUJ");
		driver.findElement(By.xpath("//input[contains(@class,'login-button')]")).click();
	}
}
