package webElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUsegetRectMethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login.php");
		Thread.sleep(2000);
		Rectangle rect = driver.findElement(By.name("login")).getRect();
		System.out.println(rect.getHeight());
		System.out.println(rect.getWidth());
		System.out.println(rect.getX());
		System.out.println(rect.getY());

	}

}
