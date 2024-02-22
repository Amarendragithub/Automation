package webElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseSelectedMethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/");
		Thread.sleep(2000);
		WebElement log = driver.findElement(By.xpath("//option[text()='INR 100 - INR 199 ( 16 ) ']"));
		System.out.println(log.isSelected());
		log.click();
		System.out.println("==========================");
		System.out.println(log.isSelected());

	}

}
