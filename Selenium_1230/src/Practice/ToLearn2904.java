package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearn2904 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		String url = driver.getCurrentUrl();
		if(url.equals("https://www.facebook.com/"))
			System.out.println("Welcome page is Display");
		else
			System.out.println("Well page is not Display");
		driver.findElement(By.partialLinkText("Contact")).click();
		List<WebElement> allHeadTags = driver.findElements(By.tagName("h2"));
		System.out.println(allHeadTags.size());
	}
}
