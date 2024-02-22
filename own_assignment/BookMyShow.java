package own_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookMyShow {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://in.bookmyshow.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Detect my location']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Fighter']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Detect my location']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Book tickets']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='3D']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("fltrsearch")).sendKeys("INOX");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//strong[text()='INOX']")).click();

	}

}
