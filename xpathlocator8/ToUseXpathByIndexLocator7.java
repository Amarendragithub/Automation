package xpathlocator8;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseXpathByIndexLocator7 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.dunzo.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[text()='Search']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Search for item or a store']")).sendKeys("mango");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//p[text()='Maaza Mango Juice'])[5]")).click();
		
		

	}

}
