package Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class ToLearn0606 {
	@Test
	public void Facebook() throws IOException, InterruptedException
	{
		FileInputStream fis1=new FileInputStream("./TestData/facebook.properties");
		FileInputStream fis2=new FileInputStream("./TestData/FaceBook.xlsx");
		Properties prop=new Properties();
		prop.load(fis1);
		Workbook wo=WorkbookFactory.create(fis2);
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(prop.getProperty("url"));
		
		FaceBookLogin fb=new FaceBookLogin(driver);
		fb.getEmailOrPhoneNoTextField().sendKeys(wo.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue());
		fb.getPasswordTextField().sendKeys(wo.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue());
		fb.getLoginButton().click();
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./ScreenShots/0606.png");
		FileHandler.copy(temp, dest);
		
	}
}
