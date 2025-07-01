package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tolearn06050 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//section[text()='Web Table']")).click();
		Thread.sleep(4000);
		String discount = driver.findElement(By.xpath("//th[text()='SAMSUNG Galaxy']/following-sibling::td[3]")).getText();
		System.out.println(discount);
		Thread.sleep(4000);
		String price = driver.findElement(By.xpath("//th[text()='HP Envy']/following-sibling::td[4]")).getText();
		System.out.println(price);
		driver.quit();

	}

}
