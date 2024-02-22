package action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demoapp.skillrary.com/product.php");
		WebElement addbutton = driver.findElement(By.id("add"));
		
		Actions action = new Actions(driver);
		action.doubleClick(addbutton).perform();//2
		Thread.sleep(2000);
		action.doubleClick(addbutton).perform();//3
		
			
			

	}

}
