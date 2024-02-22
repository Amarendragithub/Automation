package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//step-1 :create object of Fileinputstream
				FileInputStream fis=new FileInputStream("./testData/testDataExcel.xlsx");
				
				//step-2 :Call workbook factory
				Workbook wb=WorkbookFactory.create(fis);
				
				
				//step-3 :call the methods
				String url = wb.getSheet("Sheet1").getRow(0).getCell(0).toString();
				String username = wb.getSheet("Sheet1").getRow(1).getCell(0).toString();
				String password = wb.getSheet("Sheet1").getRow(2).getCell(0).toString();
				
				
				
				//Automation script
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

				driver.get(url);
				driver.findElement(By.id("email")).sendKeys(username);
				driver.findElement(By.id("pass")).sendKeys(password);

	}

}
