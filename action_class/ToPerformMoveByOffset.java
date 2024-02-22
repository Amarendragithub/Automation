package action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformMoveByOffset {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://yonobusiness.sbi/");
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("password")).sendKeys("123456");
		
		Actions action = new Actions(driver);
		action.moveByOffset(1182, 313).clickAndHold().perform();

	}

}
