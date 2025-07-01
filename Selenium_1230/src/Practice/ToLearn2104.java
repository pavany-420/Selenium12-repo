package Practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearn2104 {
    public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.navigate().to("https://www.ajio.com/");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		String title = driver.getTitle();
		if(title.equals("Access Denied"))
			System.out.println("It is Correct");
		else
			System.out.println("It is not Correct");
		driver.manage().window().setPosition(new Point(350, 270));
		Thread.sleep(1000);
		driver.manage().window().setSize(new Dimension(400, 300));
		Thread.sleep(1000);
		driver.quit();
	}
}
