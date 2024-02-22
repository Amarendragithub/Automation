package advance_selenium_testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {

	public WebDriver driver;
	@Parameters("browserName")
	@BeforeClass
	public void toLaunchBrowser(String bname) {
		if(bname.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}else if(bname.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		Reporter.log("Browser got launched successfully", true);
		driver.manage().window().maximize();
		Reporter.log("Browser got maximized successfully", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@BeforeMethod
	public void toLogin() {
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("Navigated to Welcome page successfully", true);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("amarendrasahoo123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Sanu@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		boolean login = driver.findElement(By.linkText("amarendrasahoo123@gmail.com")).isDisplayed();
		if(login==true)
		{
			Reporter.log("Navigated to login page successfully", true);
		}else {
			Reporter.log("Error page should be displayed", true);
		}
	}
	@AfterMethod
	public void toLogout() {
		driver.findElement(By.linkText("Log out")).click();
		boolean logout = driver.findElement(By.linkText("Log in")).isDisplayed();
		if(logout==true)
		{
			Reporter.log("Logout successfully", true);
		}else {
			Reporter.log("Logout not successfully", true);
		}
	}
	@AfterClass
	public void toClaseBrowser() {
		
		Reporter.log("Browser closed successfully", true);
		driver.quit();
	}
	
	
}
