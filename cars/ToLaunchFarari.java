package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLaunchFarari {
	
	@Test(groups="smoke")
	public void farari() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ferrari.com/en-IN");
		Reporter.log("Ferari got executed", true);// Test steps
		driver.quit();
	}
	

}
