package pomRepos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_DWS_001 {

	public static void main(String[]args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://demowebshop.tricentis.com/");
		WelComePage wp =new WelComePage(driver);
		wp.getLoginLink().click();
		LoginPage lp=new LoginPage(driver);
		lp.getUsernameTextField().sendKeys("amar123@gmail.com");
		lp.getPasswordTextField().sendKeys("Sanu@123");
		lp.getLoginButton().click();
		Thread.sleep(3000);
		driver.quit();
		
	}
}
