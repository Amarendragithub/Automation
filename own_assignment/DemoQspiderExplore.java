package own_assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQspiderExplore {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//button[text()='Quick Start']")).click();

		driver.findElement(By.id("name")).sendKeys("Amarendra Sahoo");
		driver.findElement(By.id("email")).sendKeys("amar123@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[text()='Register']")).click();
		WebElement msg = driver.findElement(By.xpath("//div[@class='go3958317564']"));
		System.out.println(msg.getText());

		driver.findElement(By.partialLinkText("Login Now")).click();

		driver.findElement(By.name("email")).click();
		driver.findElement(By.name("email")).sendKeys("amar123@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	}

}
