package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopColorfetch {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(2000);
		WebElement value = driver.findElement(By.xpath("//span[text()='Login was unsuccessful. Please correct the errors and try again.']"));
		System.out.println(value.getCssValue("color"));
		WebElement value1 = driver.findElement(By.xpath("//li[text()='No customer account found']"));
		System.out.println(value1.getCssValue("color"));

	}

}
