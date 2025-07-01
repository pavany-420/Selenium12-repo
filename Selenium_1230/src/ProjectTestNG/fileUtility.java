package ProjectTestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fileUtility {
	public String getDataFromExcelFile(String sheet,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./TestData/project.properties");
		Workbook wis=WorkbookFactory.create(fis);
		return wis.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		
	}
	public String getDatafromPropertyFile(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./TestData/project.properties");
		Properties pis=new Properties();
		pis.load(fis);
		return pis.getProperty(key);
	}
}
