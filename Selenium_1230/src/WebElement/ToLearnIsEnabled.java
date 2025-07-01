package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnIsEnabled {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/ui/button/buttonDisabled?sublist=4");
		Thread.sleep(3000);
		//Boolean status = driver.findElement(By.id("submitButton")).isEnabled();
		//System.out.println(status);
		System.out.println(driver.findElement(By.id("submitButton")).isEnabled());
	}
}
