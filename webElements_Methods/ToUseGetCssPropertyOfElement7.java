package webElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetCssPropertyOfElement7 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.actitime.com/");
		Thread.sleep(2000);
		WebElement value = driver.findElement(By.linkText("Try Free"));
		System.out.println(value.getCssValue("font-size"));
		System.out.println(value.getCssValue("font-weight"));
		System.out.println(value.getCssValue("background-color"));
		System.out.println(value.getCssValue("max-width"));

	}

}
