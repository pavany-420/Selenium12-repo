package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnCssSelectorAss1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		String url = driver.getCurrentUrl();
		if(url.equals("https://demowebshop.tricentis.com/"))
			System.out.println("Welcome page is Displayed");
		else
			System.out.println("Welcome page is not Displayed");
		driver.findElement(By.cssSelector("input[value='Vote']")).click();
	}
}
