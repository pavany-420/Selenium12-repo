package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToLearnClose {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://in.bookmyshow.com");
		driver.quit();
	}
}
