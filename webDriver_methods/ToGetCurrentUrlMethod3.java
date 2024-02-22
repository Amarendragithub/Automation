package webDriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetCurrentUrlMethod3 {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();//launch
		driver.get("https://www.amazon.in/");//amazon
		
		String urlOfWebpage = driver.getCurrentUrl();
		System.out.println(urlOfWebpage);

	}

}
