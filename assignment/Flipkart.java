package assignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Mobiles']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Electronics']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Apple']")).click();
		Thread.sleep(2000);
		String mainwindowId = driver.getWindowHandle();
		driver.findElement(By.xpath("//div[text()='Apple iPhone 14 (Midnight, 128 GB)']")).click();

		Set<String> windowids = driver.getWindowHandles();

		Iterator<String> it = windowids.iterator();
		String parentwindow = it.next();
		String childWindow = it.next();
		driver.switchTo().window(childWindow);

		WebElement addtoCart = driver.findElement(By.xpath("//*[local-name()='svg' and @class='_1KOMV2']/../.."));
		System.out.println(addtoCart.isDisplayed());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", addtoCart);
		System.out.println("-----in-----");
		addtoCart.click();
		Thread.sleep(2000);
		System.out.println("-----out-----");
		driver.close();
		driver.switchTo().window(parentwindow);
		Thread.sleep(2000);
		System.out.println(driver.getWindowHandle());
		driver.findElement(By.xpath("//div[text()='Apple iPhone 14 (Midnight, 128 GB)']")).click();
	}

}
