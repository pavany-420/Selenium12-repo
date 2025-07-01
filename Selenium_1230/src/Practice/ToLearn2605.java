package Practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class ToLearn2605 {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		driver.findElement(By.xpath("//a[text()='Right Click']")).click();
		WebElement ele = driver.findElement(By.xpath("//button[@id='btn_a']"));
		Actions act=new Actions(driver);
		act.contextClick(ele).perform();
		driver.findElement(By.xpath("//div[text()='Yes']")).click();
		WebElement yesMessage = driver.findElement(By.xpath("//span[text()='You selected \"Yes\"']"));
		System.out.println(yesMessage.getText());
		System.out.println(yesMessage.getCssValue("color"));
		File temp = driver.findElement(By.xpath("//span[text()='You selected \"Yes\"']")).getScreenshotAs(OutputType.FILE);
		File dest=new File("./ScreenShots/2605.png");
		FileHandler.copy(temp, dest);
	}
}
