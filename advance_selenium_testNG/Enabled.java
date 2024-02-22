package advance_selenium_testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled {
	
	@Test(enabled=false)
	public void cricbuzz() {//Test case
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		Reporter.log("Cricbuzz got executed", true);//Test steps
		driver.quit();
	}
	//@Test(priority = -4)
	
	@Test(enabled=false)//It will skip the test case
	public void baskinRobbins() {
		WebDriver driver =new ChromeDriver();
		driver.get("https://baskinrobbinsindia.com/");
		Reporter.log("BaskinRobbins got executed", true);
		driver.quit();
	}
	//@Test(priority = -2)
	
	@Test(enabled=true)// It will execute- By default it will be true.
	public void amazon() {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Reporter.log("Amazon got executed", true);
		driver.quit();
	}

}
