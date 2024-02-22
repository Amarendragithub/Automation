package webDriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToExploreManageMethods7 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://skillrary.com/user/login");

		// To maximize

		// driver.manage().window().maximize();
		Thread.sleep(2000);

		// To minimize

		// driver.manage().window().minimize();

		// To fullscreen
		// driver.manage().window().fullscreen();

		// To get size

		// Dimension sizeOfTheBrowser = driver.manage().window().getSize();//size of
		// browser and return type is Dimension<class>
		// System.out.println(sizeOfTheBrowser);

		// To set size

		// driver.manage().window().setSize(new Dimension(500,700));
		// OR
		// Dimension d=new Dimension(9100,6100);
		// driver.manage().window().setSize(d);

		// To get position

		// Point pos = driver.manage().window().getPosition();
		// System.out.println(pos);

		// To set position

		// driver.manage().window().setPosition(new Point(70,70));
		// OR
		Point p = new Point(70, 70);
		driver.manage().window().setPosition(p);

	}

}
