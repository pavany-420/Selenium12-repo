package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetSize {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Dimension size = driver.findElement(By.xpath("//input[@value='Search']")).getSize();
		System.out.println(size);
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		Dimension comp = driver.findElement(By.xpath("//input[@id='small-searchterms']")).getSize();
		System.out.println(comp);
		System.out.println(comp.getHeight());
		System.out.println(comp.getWidth());
		
	}
}
