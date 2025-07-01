package Practice;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearn2304 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com/");
		String title = driver.getTitle();
		
		System.out.println(title);
		if(title.equals("MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday"))
			System.out.println("Welcome Page is Displayed");
		else
			System.out.println("Welcome page is not Displayed");
		driver.navigate().refresh();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Set<String> windowId = driver.getWindowHandles();
		System.out.println(windowId);
		for(String s:windowId)
		{
			System.out.println(s);
		}
		driver.quit();
	}
}
