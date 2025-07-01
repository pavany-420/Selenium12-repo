package Practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearn1904 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		int height = driver.manage().window().getSize().getHeight();
		int width = driver.manage().window().getSize().getWidth();
		System.out.println(height);
		System.out.println(width);
		driver.manage().window().setSize(new Dimension(750, 900));
		Thread.sleep(5000);
		driver.quit();
	}
}
