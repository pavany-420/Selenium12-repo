package Practice;

import java.io.File;
import java.io.IOException;
import java.nio.channels.SelectableChannel;
import java.time.Duration;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class ToLearn3105 {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement facebook = driver.findElement(By.linkText("Facebook"));
		Actions act=new Actions(driver);
		act.moveToElement(facebook).perform();
		facebook.click();
		switchToWindow(driver, "nopCommerce");
		driver.findElement(By.xpath("//span[text()='Create new account']")).click();
		switchToWindow(driver, "2FnopCommerce");
		WebElement month = driver.findElement(By.id("month"));
		Select sel=new Select(month);
		sel.selectByVisibleText("Dec");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./ScreenShots/3105.png");
		FileHandler.copy(temp, dest);
	}
	public static void switchToWindow(WebDriver driver, String expUrl) 
	{
		Set<String> allWindowIds = driver.getWindowHandles();
		for(String id: allWindowIds)
		{
			driver.switchTo().window(id);
			String actUrl = driver.getCurrentUrl();
			if(actUrl.contains(expUrl))
				break;
				
		}
		
	}
}
