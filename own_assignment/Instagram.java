package own_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.instagram.com/");
		driver.findElement(By.name("username")).sendKeys("7504526090");
		driver.findElement(By.name("password")).sendKeys("Sanu@1234");
		

	}

}
