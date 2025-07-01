package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SingleSelect {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		WebElement date = driver.findElement(By.id("day"));
		Select dateSel=new Select(date);
		dateSel.selectByIndex(14);
		WebElement month = driver.findElement(By.id("month"));
		Select monthSel=new Select(month);
		monthSel.selectByValue("8");
		WebElement year = driver.findElement(By.id("year"));
		Select yearSel=new Select(year);
		yearSel.selectByVisibleText("1947");
	//	yearSel.deselectAll();                                          
		
	}
}
