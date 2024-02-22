package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleSingleSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		//identify dropdowns
		WebElement day = driver.findElement(By.id("day"));//day
		WebElement month = driver.findElement(By.id("month"));//month
		WebElement year = driver.findElement(By.id("year"));//year
		
		//handle by select class
		Select daydropdown=new Select(day);//daydropdown
		Select monthdropdown=new Select(month);//monthdropdown
		Select yeardropdown=new Select(year);//yeardropdown
		
		//call the methods
		daydropdown.selectByIndex(18);//day
		monthdropdown.selectByValue("11");//month
		yeardropdown.selectByVisibleText("2000");//year
		
		//daydropdown.deselectAll();//UnsupportedOperationException
		
//		//To fetch every option in monthDropdown
//		List<WebElement> allmonths = monthdropdown.getOptions();
//		for(WebElement month1 : allmonths)
//		{
//			System.out.println(month1.getText());
//			monthdropdown.selectByVisibleText(month1.getText());
//			Thread.sleep(2000);
//		}
//		System.out.println("=====================================");
//		
//		//To check Singleselect or Multiselect
//		System.out.println(daydropdown.isMultiple());

	}

}
