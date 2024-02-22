package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLaunchTata {

	@Test(groups="system")
	public void tata() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://cars.tatamotors.com/");
		Reporter.log("Tata got executed", true);// Test steps
		driver.quit();
	}
}
