package advance_selenium_testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnTestNg {//TestNg class
	
//	WebDriver driver =new ChromeDriver();
//	WebDriver driver1 =new ChromeDriver();
//	WebDriver driver2 =new ChromeDriver();
	
	//@Test(priority = 3)//priority attribute
	
	@Test(priority = 3, invocationCount = 0)//Incovation count
	public void cricbuzz() {//Test case
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		Reporter.log("Cricbuzz got executed", true);//Test steps
		driver.quit();
	}
	//@Test(priority = -4)
	
	@Test(priority = 3,invocationCount = 2)
	public void baskinRobbins() {
		WebDriver driver =new ChromeDriver();
		driver.get("https://baskinrobbinsindia.com/");
		Reporter.log("BaskinRobbins got executed", true);
		driver.quit();
	}
	//@Test(priority = -2)
	
	@Test(priority = 3,invocationCount = 2)
	public void amazon() {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Reporter.log("Amazon got executed", true);
		driver.quit();
	}

}
