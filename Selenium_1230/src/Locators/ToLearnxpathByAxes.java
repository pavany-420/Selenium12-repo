package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnxpathByAxes {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/hp/Desktop/wow.html");
		
		String position = driver.findElement(By.xpath("//td[text()='Salar']/preceding-sibling::td ")).getText();
		System.out.println(position);
		String collection = driver.findElement(By.xpath("//td[text()='KGF']/following-sibling::td[1]")).getText();
		System.out.println(collection);
	}
}
