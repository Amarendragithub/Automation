package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NavigateInstagram {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		//EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("7504526090");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Sanu@1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@aria-label='Search input']")).sendKeys("__r_o__s_y__");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='__r_o__s_y__']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Message']")).click();
		
		

	}

}
