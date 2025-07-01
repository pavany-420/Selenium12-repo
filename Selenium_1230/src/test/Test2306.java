package test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Test2306 {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.dream11.com/");
		WebElement phno = driver.findElement(By.id("send-sms-iframe"));
		
		driver.switchTo().frame(phno);
		driver.findElement(By.id("regEmail")).sendKeys("123456");
		driver.findElement(By.linkText("GET APP LINK")).click();
		driver.switchTo().parentFrame();
		JavascriptExecutor jc=(JavascriptExecutor) driver;
		jc.executeScript("window.scrollTo(0,3500)");
		driver.findElement(By.linkText("About Us")).click();
		
		switchToWindow(driver, "Home - Dream Sports");
		driver.findElement(By.linkText("Dream Responsibly")).click();
		switchToWindow(driver, "Home - Dream Responsibly");
		driver.findElement(By.linkText("Dream Stories")).click();Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./ScreenShots/2306.png");
		FileHandler.copy(temp, dest);
		
		
		
	}
	public static void switchToWindow(WebDriver driver,String exp)
	{
		Set<String> allWindowids = driver.getWindowHandles();
		for(String id: allWindowids)
		{
			driver.switchTo().window(id);
			String title = driver.getTitle();
			if(title.equals(exp))
				break;
		}
	}
}
