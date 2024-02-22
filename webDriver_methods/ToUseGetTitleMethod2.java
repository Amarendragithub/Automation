package webDriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetTitleMethod2 {

	public static void main(String[] args) {
		
ChromeDriver driver=new ChromeDriver();//Launch empty chrome browser & start server
		
		
		driver.get("https://www.facebook.com/");//facebook
		String titleOfWebpage = driver.getTitle();//capture title
		System.out.println(titleOfWebpage);

	}

}
