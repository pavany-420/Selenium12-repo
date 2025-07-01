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
import org.openqa.selenium.support.ui.Select;

public class ToLearn2105 {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Books")).click();
		WebElement position = driver.findElement(By.id("products-orderby"));
		Select pos=new Select(position);
		pos.selectByIndex(2);
		WebElement display = driver.findElement(By.id("products-pagesize"));
		Select disp=new Select(display);
		disp.selectByValue("https://demowebshop.tricentis.com/books?orderby=6&pagesize=12");
		WebElement view = driver.findElement(By.id("products-viewmode"));
		Select viewAs=new Select(view);
		viewAs.selectByVisibleText("Grid");
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./ScreenShots/Assgn2105.png");
		FileHandler.copy(temp, dest);
	}
}
