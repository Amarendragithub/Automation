package own_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookWelcomePage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		 boolean wpage = driver.findElement(By.id("facebook")).isDisplayed();
		 if(wpage==true)
		 {
			 System.out.println("Facebook welcome page is displayed");
		 }else {
			 System.out.println("Facebook welcome page not displayed");
		 }
		

	}

}
