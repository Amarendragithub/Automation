package advance_selenium_testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToLearnDataProvider {

	@DataProvider(name = "cred")
	public String[][] sendData() {
		String[][] data = { { "amar123@gmail.com", "Sanu@123" }, { "sanu123@gmail.com", "Amar@123" } };

		return data;
	}
	@Test(dataProvider="cred")
	public void toLogin(String email,String password) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(password);
	}
}
