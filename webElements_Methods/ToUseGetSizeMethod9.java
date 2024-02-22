package webElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetSizeMethod9 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login.php");
		Thread.sleep(2000);
		Dimension sizeofloginbutton = driver.findElement(By.name("login")).getSize();
		System.out.println(sizeofloginbutton);
		System.out.println(sizeofloginbutton.getHeight());
		System.out.println(sizeofloginbutton.getWidth());

	}

}
