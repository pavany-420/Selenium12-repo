package Practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearn2305 {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		
		WebElement frame = driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]"));
		driver.switchTo().frame(frame);
		driver.findElement(By.id("montana")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		driver.findElement(By.id("user")).sendKeys("pavandeopa123@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("pavan@123");
		driver.findElement(By.id("cpass")).sendKeys("pavan@123");
		driver.findElement(By.id("firstName")).sendKeys("Ruchika");
		driver.findElement(By.id("lastName")).sendKeys("sahu");
		driver.findElement(By.id("phone")).sendKeys("7584216359");
		
		WebElement dropdown = driver.findElement(By.id("user-type"));
		Select sel=new Select(dropdown);
		sel.selectByIndex(3);
		driver.findElement(By.xpath("//input[@id='accept-tou']")).click();
//		driver.findElement(By.xpath("//label[contains(text(),'I have read and agree to the')]/..//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		WebElement ele = driver.findElement(By.xpath("//button[text()='Sign Up']"));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshots/2305.png");
		FileHandler.copy(temp, dest);
		
	}
}
