package webElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='$25 Virtual Gift Card']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='giftcard_2_RecipientName']")).sendKeys("Amarendra");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-2']")).click();
		Thread.sleep(3000);
		String errormsg = driver.findElement(By.xpath("//p[text()='Enter valid recipient email']")).getText();
		String errormsg1 = driver.findElement(By.xpath("//p[text()='Enter valid sender name']")).getText();
		String errormsg2 = driver.findElement(By.xpath("//p[text()='Enter valid sender email']")).getText();
		System.out.println(errormsg);
		System.out.println(errormsg1);
		System.out.println(errormsg2);
	}

}
