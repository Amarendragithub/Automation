package advance_selenium_testNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_DES_002 extends BaseClass {

	@Test
	public void toComputer() {
	driver.findElement(By.xpath("(//a[@href='/computers'])[1]")).click();
	boolean computer = driver.findElement(By.xpath("//h1[text()='Computers']")).isDisplayed();
	if (computer == true) {
		System.out.println("computer page is displayed");
	} else {
		System.out.println("computer page is not displayed");
	}
}
}
