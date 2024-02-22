package own_assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoWebShopUsingDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Books")).click();
		WebElement position = driver.findElement(By.name("products-orderby"));
		
		Select pos=new Select(position);
		
		pos.selectByVisibleText("Price: High to Low");
		List<WebElement> option = pos.getOptions();
		for(WebElement we :option)
		{
			System.out.println(we.getText());//StaleElementReferenceException
		}

	}

}

//driver.findElement(By.linkText("Register")).click();
//driver.findElement(By.id("gender-male")).click();
//driver.findElement(By.id("FirstName")).sendKeys("Amarendra");
//driver.findElement(By.id("LastName")).sendKeys("Sahoo");
//driver.findElement(By.id("Email")).sendKeys("amarendrasahoo123@gmail.com");
//driver.findElement(By.id("Password")).sendKeys("Sanu@123");
//driver.findElement(By.id("ConfirmPassword")).sendKeys("Sanu@123");
//driver.findElement(By.id("register-button")).click();
//Thread.sleep(3000);
