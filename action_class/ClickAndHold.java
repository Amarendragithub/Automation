package action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://yonobusiness.sbi/");
		driver.findElement(By.xpath("//a[@class='btn yn-btn btn-yono-homepage login-btn']")).click();
		driver.findElement(By.id("password")).sendKeys("123456");
		WebElement eye = driver.findElement(By.xpath("//div[@class='showPassword shownhide']"));
		
		Actions action = new Actions(driver);
		action.clickAndHold(eye).perform();
		Thread.sleep(2000);
		action.release(eye).perform();

	}

}
