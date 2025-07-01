package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnPromptPopUp {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		WebElement ele = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(ele);
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert popup = driver.switchTo().alert();
		System.out.println(popup.getText());
		popup.sendKeys("DeoPavan");
		popup.accept();
		
		
	}
}
