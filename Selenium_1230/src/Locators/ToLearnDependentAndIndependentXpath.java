package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnDependentAndIndependentXpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://shoppersstack.com/");
		Thread.sleep(15000);
		driver.findElement(By.xpath("//span[text()='ROADSTER']/../..//button[@name='addToCart']")).click();

	}

}
