package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnRed {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Bus Ticket Booking Online at Cheapest Price with Top Bus Operators- redBus"))
			System.out.println("Welcome page is display ");
		else
			System.out.println("Welcome page is not displayed");
		Thread.sleep(5000);
		driver.quit();
	}
}
