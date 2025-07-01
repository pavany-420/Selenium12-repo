package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnCssSelectorAss2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/hp/Desktop/Assignment.html");
		driver.findElement(By.xpath("/html/body/input[9]")).click();
		driver.findElement(By.xpath("//input[6]")).click();
		
	}
}
