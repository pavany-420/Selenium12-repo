package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TolearnMultipleSelectDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/hp/Desktop/dropdown.html");

		WebElement cars = driver.findElement(By.id("Cars"));

		Select ref = new Select(cars);
		ref.selectByIndex(0);
		ref.selectByValue("2");
		ref.selectByVisibleText("tata");

	}

}
