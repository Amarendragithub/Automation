package assignmentafteractionsclass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToHandleChildWindowPopup {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14" + Keys.ENTER);
		String parentId = driver.getWindowHandle();
		driver.findElement(By.xpath("(//span[text()='Apple iPhone 14 (256 GB) - (Product) RED'])[1]")).click();
		Set<String> allWindowIds = driver.getWindowHandles();
		allWindowIds.remove(parentId);
		for (String windowId : allWindowIds) {
			driver.switchTo().window(windowId);
		}
		TakesScreenshot ts = (TakesScreenshot) driver;// typecasing
		File temp = ts.getScreenshotAs(OutputType.FILE);// temporary location
		File src = new File("./errorShots/Amazon2.png");// permanent location
		FileHandler.copy(temp, src);

	}

}
