package webDriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseCloseMethod5 {

	public static void main(String[] args)throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();//Create the object in browser specific class
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.close();//close parent window & not stop the server

	}

}
