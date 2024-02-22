package action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformMouseHover {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.woodenstreet.com/");
		Actions action = new Actions(driver);
		driver.findElement(By.id("loginclose1")).click();
		
		WebElement mhe = driver.findElement(By.linkText("Dining & Kitchen"));
		action.moveToElement(mhe).perform();

	}

}
