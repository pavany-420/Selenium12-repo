package takesScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakesScreenShotOFWebElement {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		String time = LocalDateTime.now().toString().replace(":", "-");
		File temp = driver.findElement(By.xpath("//label[text()='Excellent']/..")).getScreenshotAs(OutputType.FILE);
		File dest=new File("./ScreenShots/"+time+".png");
		FileHandler.copy(temp, dest);
	}
}
