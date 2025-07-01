package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearn2804 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Pavan");
		driver.findElement(By.id("LastName")).sendKeys("Deo");
		driver.findElement(By.id("Email")).sendKeys("wo123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Deopavan");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Deopavan");
		driver.findElement(By.id("register-button")).click();
		
	}
}
