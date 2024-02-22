package assignment;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class CornerHouse {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();// Launch empty chrome browser & start server

		driver.get("https://www.cornerhouseicecreams.com/");
		Thread.sleep(2000);

		String sessionId = driver.getWindowHandle();// 32 Alphanumericvalues unique id generated
		System.out.println(sessionId);
		Thread.sleep(2000);

		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//Navigation nav = driver.navigate();
		//nav.back();

	}

}
