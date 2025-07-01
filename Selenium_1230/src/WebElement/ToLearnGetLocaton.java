package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetLocaton {
	 public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		Point position = driver.findElement(By.xpath("//input[@value='Search']")).getLocation();
		System.out.println(position);
		System.out.println(position.getX());
		System.out.println(position.getY());
		Point pos = driver.findElement(By.xpath("//input[@id='small-searchterms']")).getLocation();
		System.out.println(pos);
		System.out.println(pos.getX());
		System.out.println(pos.getY());
	}
}
