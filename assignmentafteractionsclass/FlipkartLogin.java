package assignmentafteractionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		//driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("8917651457");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
		//Thread.sleep(3000);
		//driver.quit();
		

	}

}
