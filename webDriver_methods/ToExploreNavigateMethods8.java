package webDriver_methods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToExploreNavigateMethods8 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		//deprecated meyhod=It is available but no more use
		
		ChromeDriver driver=new ChromeDriver();//Launch browser
		//driver.manage().window().maximize();
		
		//driver.navigate().to("https://www.olivegarden.com/home");//It will navigate another web application
		           //OR
		//driver.navigate().to(new URL("https://online.kfc.co.in/"));////It will navigate another web application
		
		driver.get("https://baskinrobbinsindia.com/");
		Navigation nav = driver.navigate();
		Thread.sleep(2000);
		nav.back();//back the empty browser
		Thread.sleep(2000);
		nav.forward();// forward the browser
		Thread.sleep(2000);
		nav.refresh();//refresh the page
		

	}

}
