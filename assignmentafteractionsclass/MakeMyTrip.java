package assignmentafteractionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("(//span[text()='Trains'])[1]")).click();
		driver.findElement(By.xpath("//span[text()='From']")).click();
		driver.findElement(By.xpath("//input[@aria-controls='react-autowhatever-1']")).sendKeys("Krishnarajapuram Railway Station");
		driver.findElement(By.xpath("//span[text()='KJM']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='To']")).click();
		driver.findElement(By.xpath("//input[@aria-controls='react-autowhatever-1']")).sendKeys("Bhubaneswar");
		driver.findElement(By.xpath("//span[text()='BBS']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("travelDate")).click();
		for(;;) {
			try {
				driver.findElement(By.xpath("//div[text()='May 2024']/../..//div[text()='22']")).click();
				break;
			}catch(Exception e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
//		driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
//		driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
//		driver.findElement(By.xpath("(//div[text()='22'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Class']")).click();
		driver.findElement(By.xpath("//li[text()='Third AC']")).click();
		driver.findElement(By.xpath("//a[@data-cy='submit']")).click();
		driver.findElement(By.xpath("(//div[text()='3A'])[1]")).click();
		driver.findElement(By.xpath("//div[text()='OK, GO AHEAD']")).click();
		driver.findElement(By.xpath("(//label[@for='r1'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Add Traveller']")).click();
		driver.findElement(By.id("name")).sendKeys("Amarendra Sahoo");
		driver.findElement(By.id("age")).sendKeys("23");
		driver.findElement(By.xpath("//span[text()='Select']")).click();
		driver.findElement(By.xpath("//span[text()='Male']")).click();
		//driver.findElement(By.xpath("(//ul[@class='quotaBox  makeAbsolute textLeft font14 darkGreyText'])[2]")).click();
		driver.findElement(By.xpath("//button[text()='Add']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter IRCTC username']")).click();
		driver.findElement(By.id("IRCTCUserName")).sendKeys("sanu123");
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		driver.findElement(By.id("contactEmail")).sendKeys("amarendrasahoo787@gmail.com");
		driver.findElement(By.id("mobileNumber")).sendKeys("8917651457");
		

	}

}
