package webDriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseQuitMethod6 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();//Create the object in browser specific class
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.quit();//close parent and child window & stop the server

	}

}
