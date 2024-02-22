package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.myntra.com/");
		Thread.sleep(3000);
		 List<WebElement> ref = driver.findElements(By.xpath("(///div[@class='desktop-navLink']/div"));
		for(WebElement ele : ref)
		{
			System.out.println(ele.getText());
		}

	}

}
