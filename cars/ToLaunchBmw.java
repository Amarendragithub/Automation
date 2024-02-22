package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLaunchBmw {

	@Test(groups="smoke")
	public void bmw() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bmw.in/en/index.html");
		Reporter.log("BMW got executed", true);// Test steps
		driver.quit();
	}
}
