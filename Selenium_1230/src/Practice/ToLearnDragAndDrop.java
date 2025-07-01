package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnDragAndDrop {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		Actions act=new Actions(driver);
		WebElement ele1=driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement ele2=driver.findElement(By.id("trash"));
		act.dragAndDrop(ele1, ele2).perform();
	}
}
