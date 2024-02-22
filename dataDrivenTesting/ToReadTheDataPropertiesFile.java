package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadTheDataPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		//step-1 :create object of Fileinputstream
		FileInputStream fis=new FileInputStream("./testData/testData.properties");
		
		//step-2 :create an object of respective file type
		Properties prop=new Properties();
		
		//step-3 :call the methods
		prop.load(fis);
		
		//Read data
		String url = prop.getProperty("url");
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		
		//Automation script
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get(url);
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		

	}

}
