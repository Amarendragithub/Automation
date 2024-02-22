package xpathlocator8;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseXpathByAxes6 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("file:///C:/Users/Amare/OneDrive/Desktop/Q-Automation/film.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//td[text()='Intersteller']/following-sibling::td")).click();

	}

}
