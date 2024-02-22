package webDriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetPageSourceMethod4 {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();//launch browser
		
		driver.get("https://www.zomato.com/india");
		String sourcecode = driver.getPageSource();//html code
		System.out.println(sourcecode);

	}

}
