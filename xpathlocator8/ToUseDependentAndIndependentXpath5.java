package xpathlocator8;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToUseDependentAndIndependentXpath5 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("shopperstack1234@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("Password@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='SAMSUNG Galaxy Z Flip4 ']/../..//button[@id='addToCart']")).click();

	}

}
