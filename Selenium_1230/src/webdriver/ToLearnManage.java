package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnManage {
    public static void main(String[] args) throws InterruptedException {
    	WebDriver driver=new ChromeDriver();
    	driver.get("https://www.redbus.in/");
    	Thread.sleep(5000);
    	driver.manage().window().maximize();
    	Thread.sleep(5000);
    	driver.manage().window().minimize();
    	Thread.sleep(5000);
    	driver.manage().window().maximize();
    	Thread.sleep(5000);
    	driver.manage().window().fullscreen();
    	Thread.sleep(2000);
    	driver.quit();
    }
}
