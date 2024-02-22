package assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToNavigatePolarBear {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();// Launch empty chrome browser & start server

		driver.get("https://en.wikipedia.org/wiki/Polar_bear");
		String titleOfWebpage = driver.getTitle();//capture title
		System.out.println(titleOfWebpage);


	}

}
