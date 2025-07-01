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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import takesScreenShot.TakeScreenShotOfWebPage;

public class ToLearn2905 {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.freshersworld.com/");
		
		driver.findElement(By.id("reg_new_btn")).click();
		//driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\hp\\Desktop\\PAVAN.Y Resume.pdf");
		//driver.switchTo().frame("body");
//		driver.switchTo().defaultContent();
		WebElement ele = driver.findElement(By.xpath("//a[text()='Jobs']"));
		//driver.switchTo().frame("body");
		Actions act1=new Actions(driver);
		act1.moveToElement(ele).perform();
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./ScreenShots/2905.png");
		FileHandler.copy(temp,dest);
	}
}
