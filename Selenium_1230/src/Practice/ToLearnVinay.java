package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnVinay {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20) );
		driver.get("https://www.flipkart.com/search?q=iphone&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		List<WebElement> allPri = driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
		int c=0;
		for(WebElement prize:allPri)
		{
			System.out.println(prize.getText());
			c++;
		}
		System.out.println(c);
	}
}
