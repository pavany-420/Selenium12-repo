package miniproject;

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
import org.openqa.selenium.support.ui.Select;

public class FaceBookRegister {
	public static void main(String[] args) throws IOException {
		FileInputStream fis1=new FileInputStream("./TestData/facebook.properties");
		FileInputStream fis2=new FileInputStream("./TestData/FaceBook.xlsx");
		Properties prop=new Properties();
		prop.load(fis1);
		Workbook wo=WorkbookFactory.create(fis2);
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(prop.getProperty("url"));
		
		FaceBookRegisterPage fb=new FaceBookRegisterPage(driver);
		fb.getFirstNameTextField().sendKeys(wo.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue());
		fb.getLastNameTextField().sendKeys(wo.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue());
		Select sl=new Select(fb.getDayRadioButton());
		sl.selectByIndex(17);
		sl=new Select(fb.getMonthRadioButton());
		sl.selectByValue("5");
		sl=new Select(fb.getYearRadioButton());
		sl.selectByVisibleText("2001");
		fb.getMaleRadioButton().click();
		fb.getEmailOrPhoneNoTextField().sendKeys(wo.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue());
		fb.getPasswordTextField().sendKeys(wo.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue());
		fb.getSignInButton().click();
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./ScreenShots/0506.png");
		FileHandler.copy(temp, dest);
		
		
	}
}
