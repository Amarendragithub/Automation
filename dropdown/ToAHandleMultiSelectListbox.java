package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToAHandleMultiSelectListbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demoapp.skillrary.com/");
		
		//identify dropdowns
		WebElement multipledropdown = driver.findElement(By.id("cars"));
		
		////handle by select class
		Select multidropdown=new Select(multipledropdown);
		
		//call methods
		System.out.println(multidropdown.isMultiple());
		
		//select
		multidropdown.selectByIndex(0);
		multidropdown.selectByValue("99");
		Thread.sleep(2000);
		
		//deselect
		multidropdown.deselectByIndex(0);
		multidropdown.deselectByValue("99");
		//multidropdown.deselectAll();

	}

}
