package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebPageScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.youtube.com/");
		Thread.sleep(4000);
		TakesScreenshot ts=(TakesScreenshot) driver;//typecasing
	    File temp = ts.getScreenshotAs(OutputType.FILE);//temporary location
	    File src=new File("./errorShots/youTube.png");//permanent location
	    FileHandler.copy(temp, src);

	}

}
