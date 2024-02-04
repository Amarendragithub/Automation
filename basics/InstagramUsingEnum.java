package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramUsingEnum {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.instagram.com/");
		WebElement un = driver.findElement(By.name("username"));
		un.sendKeys("Amarendra");
		un.sendKeys(Keys.CONTROL+"a");
		un.sendKeys(Keys.CONTROL+"c");
		WebElement pw = driver.findElement(By.name("password"));
		pw.sendKeys(Keys.CONTROL+"v");

	}

}
