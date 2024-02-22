package advance_selenium_testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ThreadPoolSize {

	@Test(invocationCount = 3, threadPoolSize = 3) // Invocationcount and threadpoolsize are dependent each other.
													// without Invocationcount threadpoolsize is not working.
	public void cricbuzz() {// Test case
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		Reporter.log("Cricbuzz got executed", true);// Test steps
		driver.quit();
	}

	@Test(invocationCount = 0)
	public void baskinRobbins() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://baskinrobbinsindia.com/");
		Reporter.log("BaskinRobbins got executed", true);
		driver.quit();
	}

	@Test(invocationCount = 4, threadPoolSize = 4)
	public void amazon() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Reporter.log("Amazon got executed", true);
		driver.quit();
	}

}
