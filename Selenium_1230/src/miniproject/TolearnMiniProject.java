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

public class TolearnMiniProject {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./TestData/commondata.properties");
		FileInputStream fis1=new FileInputStream("./TestData/AssignmentTextScript.xlsx");
		Properties pops=new Properties();
		pops.load(fis);
		Workbook wo=WorkbookFactory.create(fis1);
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(pops.getProperty("url"));
		WelComePage wl=new WelComePage(driver);
		wl.getRegisterLink().click();
		RegisterPage rp=new RegisterPage(driver);
		rp.getGenderMaleRadioButton().click();
		rp.getFirstNameTextField().sendKeys(wo.getSheet("Sheet-1").getRow(1).getCell(0).getStringCellValue());
		rp.getLastNameTextField().sendKeys(wo.getSheet("Sheet-1").getRow(1).getCell(1).getStringCellValue());
		rp.getEmailTextField().sendKeys(wo.getSheet("Sheet-1").getRow(1).getCell(2).getStringCellValue());
		rp.getPasswordTextField().sendKeys(wo.getSheet("Sheet-1").getRow(1).getCell(3).getStringCellValue());
		rp.getConfirmPasswordTextField().sendKeys(wo.getSheet("Sheet-1").getRow(1).getCell(4).getStringCellValue());
		rp.getRegisterButton().click();
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./ScreenShots/0406.png");
		FileHandler.copy(temp, dest);
	}

}
