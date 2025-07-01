package webdriver;

import java.awt.Window;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetPosition {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Point position = driver.manage().window().getPosition();
		driver.get("https://www.youtube.com/");
		System.out.println(position.getX());
		System.out.println(position.getY());
	}
}
