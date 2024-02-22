package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLaunchRollsRoyce {

	@Test(groups="Functional")
	public void rr() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rolls-roycemotorcars.com/en_GB/home.html");
		Reporter.log("Rollsroyce got executed", true);// Test steps
		driver.quit();
	}
}
