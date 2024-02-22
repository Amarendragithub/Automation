package advance_selenium_testNG;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_001 extends BaseClass {

	@Test
	public void toBook() {

		driver.findElement(By.partialLinkText("Books")).click();
		boolean book = driver.findElement(By.xpath("//h1[text()='Books']")).isDisplayed();
		if (book == true) {
			System.out.println("Book page is displayed");
		} else {
			System.out.println("Book page is not displayed");
		}
	}


}
