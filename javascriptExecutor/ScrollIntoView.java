package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		JavascriptExecutor js=(JavascriptExecutor) driver;//scrollIntoView
		WebElement indiaflag = driver.findElement(By.xpath("//td[text()='India']"));
		//js.executeScript("arguments[0].scrollIntoView(true)",indiaflag);
		js.executeScript("arguments[0].scrollIntoView(false)",indiaflag);

	}

}
