package own_assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookDOB {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
	    driver.findElement(By.id("day")).sendKeys("19");//day
		driver.findElement(By.id("month")).sendKeys("Nov");//month
		driver.findElement(By.id("year")).sendKeys("2000");//year

	}

}
