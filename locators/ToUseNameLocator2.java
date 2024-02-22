package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseNameLocator2 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/?hl=en");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("7504526090");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("7504526090");

	}

}
