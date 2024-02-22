package webDriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetMethod1 {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();//Launch empty chrome browser & start server
		
		driver.get("https://ineuron.ai/");
		driver.get("https://www.facebook.com/");

	}

}
