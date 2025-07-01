package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnIsSelected {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		WebElement radiobut = driver.findElement(By.xpath("//label[text()='Good']/..//input[@type='radio']"));
		System.out.println(radiobut.isSelected());
		radiobut.click();
		System.out.println(radiobut.isSelected());
		
	}
}
