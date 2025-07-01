package Practice;

import java.io.File;
import java.io.IOException;
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




public class Tolearn2705 {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		 WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		 driver.switchTo().frame(frame);
		 WebElement source1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		 WebElement scorce2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		 WebElement trash = driver.findElement(By.id("trash"));
		 Actions act=new Actions(driver);
		 act.dragAndDrop(source1, trash).perform();
		 act.dragAndDrop(scorce2, trash).perform();
		 driver.switchTo().parentFrame();
		 driver.findElement(By.partialLinkText("CHEATSHEETS")).click();
		 Thread.sleep(1000);
		 driver.navigate().back();
		 Thread.sleep(1000);
		 driver.navigate().forward();
		 driver.findElement(By.linkText("SQL Cheat Sheet")).click();
		 Set<String> allids = driver.getWindowHandles();
		 for(String id:allids)
		 {
			 driver.switchTo().window(id);
			 String title = driver.getTitle();
			 if(title.contains("SQL Cheat Sheet"))
			       break;
		 }
		 WebElement sql = driver.findElement(By.xpath("(//img[@loading='lazy'])[2]"));
		 Actions act1=new Actions(driver);
		 act1.scrollToElement(sql).perform();
		 TakesScreenshot ts=(TakesScreenshot) driver;
		 File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/sql.png");
		FileHandler.copy(temp, dest);
		driver.quit();
		 
		 
		 
	}

}
