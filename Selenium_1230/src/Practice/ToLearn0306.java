package Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class ToLearn0306 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./TestData/AssignmentTextScript.xlsx");
		FileInputStream fis1=new FileInputStream("./TestData/commondata.properties");
		
		Properties pops=new Properties();
		pops.load(fis1);
		
		Workbook wo=WorkbookFactory.create(fis);
		
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(pops.getProperty("url"));
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("FirstName")).sendKeys(wo.getSheet("Sheet-1").getRow(1).getCell(0).getStringCellValue());
		driver.findElement(By.id("LastName")).sendKeys(wo.getSheet("Sheet-1").getRow(1).getCell(1).getStringCellValue());
		driver.findElement(By.id("Email")).sendKeys(wo.getSheet("Sheet-1").getRow(1).getCell(2).getStringCellValue());
		driver.findElement(By.id("Password")).sendKeys(wo.getSheet("Sheet-1").getRow(1).getCell(3).getStringCellValue());
		driver.findElement(By.id("ConfirmPassword")).sendKeys(wo.getSheet("Sheet-1").getRow(1).getCell(4).getStringCellValue());
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./ScreenShots/0306.png");
		FileHandler.copy(temp, dest);
		
	}
}
