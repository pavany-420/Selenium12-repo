package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXPath {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/hp/Desktop/Assignment.html");
		//driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("Anup Chuthiya");
		driver.findElement(By.xpath("//input[1]")).sendKeys("Anup randi");
	}
}
