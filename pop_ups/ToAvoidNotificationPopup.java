package pop_ups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToAvoidNotificationPopup {

	public static void main(String[] args) {
		
		//To Change browser settings
		ChromeOptions setting=new ChromeOptions();
		//setting.addArguments("--disable-notifications");
		setting.addArguments("--Incognito");
		
		//To Launch browser
		WebDriver driver = new ChromeDriver(setting);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.yatra.com/");

	}

}
