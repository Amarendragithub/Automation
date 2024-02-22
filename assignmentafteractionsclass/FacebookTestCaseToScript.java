package assignmentafteractionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FacebookTestCaseToScript {

	public static void main(String[] args) throws InterruptedException {

		// To handle notification popup
		ChromeOptions setting = new ChromeOptions();
		setting.addArguments("--disable-notifications");

		// Expected data
		String expectedLoginPageTitle = "Facebook – log in or sign up";
		String expectedUsername = "7504526090";
		String expectedPassword = "7504526090";

		// step-1:-Open the browser
		WebDriver driver = new ChromeDriver(setting);
		System.out.println("Browser got launched successfully");
		driver.manage().window().maximize();
		System.out.println("Browser got maximized successfully");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// step-2:-Enter the url
		driver.get("https://www.facebook.com/");
		String actualLoginPagetitle = driver.getTitle();
		if (actualLoginPagetitle.equals(expectedLoginPageTitle)) {
			System.out.println("Navigated successfully to Loginpage");
		} else {
			System.out.println("Failed to navigate  Loginpage");
		}

		// step-3:-Enter the username
		WebElement usernameTextfield = driver.findElement(By.id("email"));
		usernameTextfield.clear();
		usernameTextfield.sendKeys(expectedUsername);
		String actualusername = usernameTextfield.getAttribute("value");
		if (actualusername.equals(expectedUsername)) {
			System.out.println("Usernametextfeild accepted the data");
		} else {
			System.out.println("Usernametextfeild not accepted the data");
		}

		// step-4:-Enter the password
		WebElement passwordTextfield = driver.findElement(By.id("pass"));
		passwordTextfield.clear();
		passwordTextfield.sendKeys(expectedPassword);
		String actualpassword = passwordTextfield.getAttribute("value");
		if (actualpassword.equals(expectedPassword)) {
			System.out.println("passwordextfeild accepted the data");
		} else {
			System.out.println("Passwordtextfeild not accepted the data");
		}

		// step-5:-click on login button
		WebElement loginbutton = driver.findElement(By.name("login"));
		loginbutton.click();
		boolean lb = driver.findElement(By.id("facebook")).isDisplayed();
		if (lb == true) {
			System.out.println("Navigate to home page successfully");
		} else {
			System.out.println("Error page should be displayed ");
		}

		// step-6:-close the browser
		Thread.sleep(4000);
		System.out.println("Browser got closed successfully");
		driver.quit();

	}

}
