package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TolearnDeSelectOption {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/hp/Desktop/dropdown.html");
		WebElement cars = driver.findElement(By.id("Cars"));
		Select refSelect=new Select(cars);
		refSelect.selectByIndex(0);
		refSelect.selectByValue("2");
		refSelect.selectByVisibleText("tata");
		
	//	refSelect.deselectByIndex(0);
		//refSelect.deselectByValue("2");
	//	refSelect.deselectByVisibleText("tata");
		refSelect.deselectAll();
	}
}
