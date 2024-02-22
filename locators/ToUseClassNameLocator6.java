package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseClassNameLocator6 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.get("https://demowebshop.tricentis.com/");
//		Thread.sleep(3000);
//		driver.findElement(By.className("ico-login")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.className("email")).sendKeys("amar@gmail.com");
		
		driver.get("https://www.instagram.com/?hl=en");
		Thread.sleep(3000);
		driver.findElement(By.className("_aa4b _add6 _ac4d _ap35")).sendKeys("amar@gmail.com");//InvalidSelectorException because using compound class name     
        
	}

}
