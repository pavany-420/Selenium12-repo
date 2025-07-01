package Practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class ToLearn1505 {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.xpath("//span[text()='Create Account']")).click();
		driver.findElement(By.id("First Name")).sendKeys("Pavan");
		driver.findElement(By.id("Last Name")).sendKeys("Yamba");
		driver.findElement(By.id("Phone Number")).sendKeys("7894835878");
		driver.findElement(By.id("Email Address")).sendKeys("wowha020@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Abc@123#acb");
		driver.findElement(By.id("Confirm Password")).sendKeys("Abc@123#acb");
		driver.findElement(By.xpath("//a[text()='Terms and Conditions']/../..//input[@id='Terms and Conditions']")).click();
		driver.findElement(By.xpath("//button[text()='Register']")).click();
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/shoppesrstack.png");
		FileHandler.copy(temp, dest);
		//driver.close();
		
		
	}
}
