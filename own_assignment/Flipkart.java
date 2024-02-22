package own_assignment;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[text()='Mobiles']")).click();
		driver.findElement(By.xpath("//span[text()='Electronics']")).click();
		driver.findElement(By.xpath("//a[text()='Apple']")).click();
		String mainwindowId = driver.getWindowHandle();
		driver.findElement(By.xpath("//div[text()='Apple iPhone 14 (Midnight, 128 GB)']")).click();

		Set<String> windowids = driver.getWindowHandles();
		Iterator<String> it = windowids.iterator();
		String parentwindow = it.next();
		String childWindow = it.next();
		driver.switchTo().window(childWindow);
		//WebElement addtoCart = driver.findElement(By.xpath("//*[local-name()='svg' and @class='_1KOMV2']/../.."));
		WebElement addtoCart = driver.findElement(By.xpath("//button[text()='Add to cart']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", addtoCart);
		addtoCart.click();


	}

}
