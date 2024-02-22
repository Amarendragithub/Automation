package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToYoutube {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='search']")).click();
//		Thread.sleep(2000);
		driver.findElement(By.name("search_query")).sendKeys("tum hi ho");
		Thread.sleep(2000);
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("title-wrapper")).click();

	}

}
