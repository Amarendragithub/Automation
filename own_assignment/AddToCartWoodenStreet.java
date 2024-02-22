package own_assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartWoodenStreet {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.woodenstreet.com/");
		driver.findElement(By.id("loginclose1")).click();
		
		driver.findElement(By.linkText("Sofas")).click();
		driver.findElement(By.partialLinkText("Wooden Sofa")).click();
		driver.findElement(By.xpath("//h2[text()='Quartz 3 Seater Wooden Sofa (Honey Irish Cream)']")).click();	
        driver.findElement(By.id("button-cart-buy-now")).click();    
        driver.findElement(By.linkText("Living")).click();		
		driver.findElement(By.partialLinkText("Coffee Tables")).click();
		driver.findElement(By.xpath("//h2[text()='Vesta Sheesham Wood Coffee Table with Four Stools (Honey Finish, Cream Blossom)']")).click();
		driver.findElement(By.id("button-cart-buy-now")).click();
        driver.findElement(By.linkText("Storage")).click();	
		driver.findElement(By.partialLinkText("TV Units")).click();		
		driver.findElement(By.xpath("//h2[text()='Harvey Tv Unit (Exotic Teak Finish)']")).click();
		driver.findElement(By.id("button-cart-buy-now")).click();
	}

}
