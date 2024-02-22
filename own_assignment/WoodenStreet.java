package own_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WoodenStreet {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.woodenstreet.com/");
		Thread.sleep(2000);
		WebElement popUp = null;
		int i = 0;
		do {
			try {
				popUp = driver.findElement(By.id("loginclose1"));

				if (popUp.isDisplayed()) {
					popUp.click();
					System.out.println("Pop is sucessfully closed");
					break;
				}
			} catch (Exception e) {
				System.out.println("Element is not present in the Webpage");
				Thread.sleep(2000);
			}
		} while (i <= 20);

	}

}
