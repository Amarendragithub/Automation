package pomRepos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceException {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://www.facebook.com/");
		WebElement usernmaeTextfield = driver.findElement(By.id("email"));
		
		//Refresh
		//driver.navigate().refresh();
		usernmaeTextfield.sendKeys("amar123@gmail.com");

	}

}
