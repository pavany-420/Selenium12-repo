package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TolearnGetFirstSelectedOption {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/hp/Desktop/dropdown.html");
		
		WebElement comp = driver.findElement(By.id("Cars"));
		Select ref=new Select(comp);
		ref.selectByIndex(0);
		ref.selectByIndex(2);
		ref.selectByIndex(3);
//		WebElement ele = ref.getFirstSelectedOption();
		
	//	System.out.println(ele.getText());
		List<WebElement> allSelectedopts = ref.getAllSelectedOptions();
		System.out.println(allSelectedopts.size());
		for(WebElement ele:allSelectedopts)
		{
			System.out.println(ele.getText());
		}
		
	}
	
}
