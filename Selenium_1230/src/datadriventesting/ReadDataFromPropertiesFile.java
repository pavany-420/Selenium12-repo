package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadDataFromPropertiesFile {
	public static void main(String[] args) throws IOException {
		//Step 1: create FileInputStream object
		FileInputStream fis=new FileInputStream("./TestData/commondata.properties");
		//step 2: create respective file type object
		Properties props=new Properties();
		//step 3: call read methods
		props.load(fis);
		String Url = props.getProperty("url");
		System.out.println(Url);
		String Email = props.getProperty("Email");
		System.out.println(Email);
		System.out.println(props.getProperty("password"));
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(Url);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(Email);
		driver.findElement(By.id("Password")).sendKeys(props.getProperty("password"));
		
		
	}
}
