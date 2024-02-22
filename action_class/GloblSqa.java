package action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GloblSqa {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement photoManager = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));

		// switch to iframe
		driver.switchTo().frame(photoManager);

		WebElement image1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement image2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement image3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement image4 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));

		WebElement trash = driver.findElement(By.id("trash"));

		WebElement gallery = driver.findElement(By.id("gallery"));

		// Create object for actions class
		Actions actions = new Actions(driver);

		// drag and drop gallery to trash
		actions.dragAndDrop(image1, trash).perform();
		Thread.sleep(2000);
		// actions.dragAndDrop(image2, trash).perform();
		actions.dragAndDropBy(image2, 600, 0).perform();
		Thread.sleep(2000);
		// actions.dragAndDrop(image3, trash).perform();
		actions.clickAndHold(image3).moveToElement(trash).release().perform();
		Thread.sleep(2000);
		actions.dragAndDrop(image4, trash).perform();
		Thread.sleep(2000);

		// drag and drop trash to gallery
		actions.dragAndDrop(image1, gallery).perform();
		Thread.sleep(2000);
		actions.dragAndDrop(image2, gallery).perform();
		Thread.sleep(2000);
		actions.dragAndDrop(image3, gallery).perform();
		Thread.sleep(2000);
		actions.dragAndDrop(image4, gallery).perform();
		Thread.sleep(3000);

		driver.switchTo().defaultContent();
		driver.findElement(By.id("Accepted Elements")).click();
		WebElement acceptedElements = driver.findElement(By.xpath("(//iframe[@class='demo-frame lazyloaded'])[2]"));
		driver.switchTo().frame(acceptedElements);

		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));

		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));

		// drag and drop gallery to trash
		actions.dragAndDrop(drag, drop).perform();

		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("Propagation")).click();
		WebElement propagation = driver.findElement(By.xpath("(//iframe[@class='demo-frame lazyloaded'])[3]"));
		driver.switchTo().frame(propagation);

		WebElement drag1 = driver.findElement(By.xpath("//div[@id='draggable']"));

		WebElement drop1 = driver.findElement(By.xpath("//div[@id='droppable']"));

		// drag and drop gallery to trash
		actions.dragAndDrop(drag1, drop1).perform();

	}

}
