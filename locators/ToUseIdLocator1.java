package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseIdLocator1 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login.php");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("7504526090");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("7504526090");

	}

}
