package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopRegister {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("gender-male")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("FirstName")).sendKeys("Amarendra");
		Thread.sleep(2000);
		driver.findElement(By.id("LastName")).sendKeys("Sahoo");
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("amarendrasahoo788@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("Sanu@123");
		Thread.sleep(2000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Sanu@123");
		Thread.sleep(2000);
		driver.findElement(By.id("register-button")).click();
	}

}
