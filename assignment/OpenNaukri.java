package assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNaukri {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();// Launch browser
		driver.navigate().to("https://www.naukri.com/");
		Thread.sleep(2000);

		driver.manage().window().setSize(new Dimension(800, 800));

		String urlOfWebpage = driver.getCurrentUrl();
		System.out.println(urlOfWebpage);

	}

}
