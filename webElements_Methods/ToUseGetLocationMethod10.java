package webElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetLocationMethod10 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login.php");
		Thread.sleep(2000);
		Point locationofloginbutton = driver.findElement(By.name("login")).getLocation();
		System.out.println(locationofloginbutton);
		System.out.println(locationofloginbutton.getX());
		System.out.println(locationofloginbutton.getY());

	}

}
