package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLaunchLambo {

	@Test(groups="Functional")
	public void Lambo() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lamborghini.com/en-en");
		Reporter.log("Lambo got executed", true);// Test steps
		driver.quit();
	}
}
