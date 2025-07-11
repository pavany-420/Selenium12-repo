package Practice;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToLearn1205 {
	public static void main(String[] args) throws IOException, InterruptedException {
		String time = LocalDateTime.now().toString().replace(":", "-");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/"+time+".png");
		FileHandler.copy(temp, dest);
		
	}
}
