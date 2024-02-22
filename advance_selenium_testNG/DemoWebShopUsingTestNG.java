package advance_selenium_testNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoWebShopUsingTestNG {
	String expectedLoginPageTitle = "Demo Web Shop";
	String expectedUsername = "amarendrasahoo123@gmail.com";
	String expectedPassword = "Sanu@123";

	WebDriver driver = new ChromeDriver();
//	@Test(priority=-1)
//	public void excel() throws IOException {
//		//step-1 :create object of Fileinputstream
//				FileInputStream fis=new FileInputStream("./testData/testData.properties");
//				
//				//step-2 :create an object of respective file type
//				Properties prop=new Properties();
//				
//				//step-3 :call the methods
//				prop.load(fis);
//				
//				//Read data
//				String url = prop.getProperty("url");
//				String email = prop.getProperty("Email");
//				String password = prop.getProperty("Password");
//				expectedUsername=email;
//				expectedPassword=password;
//				Url=url;
//		
//	}

	@Test(priority = 1)
	public void login() throws InterruptedException {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		String actualLoginPagetitle = driver.getTitle();
		if (actualLoginPagetitle.equals(expectedLoginPageTitle)) {
			Reporter.log("Navigated successfully to Loginpage", true);
		} else {
			Reporter.log("Failed to navigate  Loginpage", true);
		}
		driver.findElement(By.linkText("Log in")).click();
		WebElement usernameTextfield = driver.findElement(By.id("Email"));
		usernameTextfield.clear();
		usernameTextfield.sendKeys(expectedUsername);
		String actualusername = usernameTextfield.getAttribute("value");
		if (actualusername.equals(expectedUsername)) {
			Reporter.log("Usernametextfeild accepted the data", true);
		} else {
			Reporter.log("Usernametextfeild not accepted the data", true);
		}

		// step-4:-Enter the password
		WebElement passwordTextfield = driver.findElement(By.id("Password"));
		passwordTextfield.clear();
		passwordTextfield.sendKeys(expectedPassword);
		String actualpassword = passwordTextfield.getAttribute("value");
		if (actualpassword.equals(expectedPassword)) {
			Reporter.log("passwordextfeild accepted the data", true);
		} else {
			Reporter.log("Passwordtextfeild not accepted the data", true);
		}
		Reporter.log("=====================================", true);
		// step-5:-click on login button
		WebElement loginbutton = driver.findElement(By.xpath("//input[@value='Log in']"));
		loginbutton.click();
		// validate in login page
		boolean validation = driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).isDisplayed();
		if (validation == true) {
			Reporter.log("Login successful", true);
		} else {
			Reporter.log("Login failed", true);
		}
		Reporter.log("=====================================", true);
		Thread.sleep(2000);
	}

	@Test(priority = 2)
	public void Book() throws InterruptedException {
		driver.findElement(By.partialLinkText("Books")).click();
		boolean book = driver.findElement(By.xpath("//h1[text()='Books']")).isDisplayed();
		if (book == true) {
			Reporter.log("Book page is displayed", true);
		} else {
			Reporter.log("Book page is not displayed", true);
		}
		driver.findElement(By.linkText("Computing and Internet")).click();
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		boolean book1 = driver.findElement(By.linkText("Computing and Internet")).isDisplayed();
		if (book1 == true) {
			Reporter.log("Book is displayed in Add to cart", true);
		} else {
			Reporter.log("Book is not displayed in Add to cart", true);
		}
		Reporter.log("=====================================", true);
		Thread.sleep(4000);
	}

	@Test(priority = 3)
	public void Computer() throws InterruptedException {
		driver.findElement(By.xpath("(//a[@href='/computers'])[1]")).click();
		boolean computer = driver.findElement(By.xpath("//h1[text()='Computers']")).isDisplayed();
		if (computer == true) {
			Reporter.log("computer page is displayed", true);
		} else {
			Reporter.log("computer page is not displayed", true);
		}
		driver.findElement(By.partialLinkText("Desktops")).click();
		driver.findElement(By.linkText("Build your own cheap computer")).click();
		driver.findElement(By.id("add-to-cart-button-72")).click();
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		boolean desktop = driver.findElement(By.linkText("Build your own cheap computer")).isDisplayed();
		if (desktop == true) {
			Reporter.log("Desktop is displayed in Add to cart", true);
		} else {
			Reporter.log("Desktop is not displayed in Add to cart", true);
		}
		Reporter.log("=====================================", true);
		Thread.sleep(2000);
	}

	@Test(priority = 4)
	public void Electronics() throws InterruptedException {
		driver.findElement(By.xpath("(//a[@href='/electronics'])[1]")).click();
		boolean electronics = driver.findElement(By.xpath("//h1[text()='Electronics']")).isDisplayed();
		if (electronics == true) {
			Reporter.log("Electronics page is displayed", true);
		} else {
			Reporter.log("Electronics page is not displayed", true);
		}
		Reporter.log("=====================================", true);
		Thread.sleep(2000);

	}

	@Test(priority = 5)
	public void Apparel() throws InterruptedException {
		driver.findElement(By.xpath("(//a[@href='/apparel-shoes'])[1]")).click();
		boolean shoes = driver.findElement(By.xpath("//h1[text()='Apparel & Shoes']")).isDisplayed();
		if (shoes == true) {
			Reporter.log("Apparel & Shoes page is displayed", true);
		} else {
			Reporter.log("Apparel & Shoes page is not displayed", true);
		}
		driver.findElement(By.partialLinkText("Blue and green Sneaker")).click();
		driver.findElement(By.id("add-to-cart-button-28")).click();
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		boolean shoes1 = driver.findElement(By.linkText("Blue and green Sneaker")).isDisplayed();
		if (shoes1 == true) {
			Reporter.log("Shoes is displayed in Add to cart", true);
		} else {
			Reporter.log("Shoes is not displayed in Add to cart", true);
		}
		Reporter.log("=====================================", true);
		Thread.sleep(2000);
	}

	@Test(priority = 6)
	public void Digital() throws InterruptedException {
		driver.findElement(By.xpath("(//a[@href='/digital-downloads'])[1]")).click();
		boolean digital = driver.findElement(By.xpath("//h1[text()='Digital downloads']")).isDisplayed();
		if (digital == true) {
			Reporter.log("Digital downloads page is displayed", true);
		} else {
			Reporter.log("Digital downloads page is not displayed", true);
		}
		driver.findElement(By.partialLinkText("3rd Album")).click();
		driver.findElement(By.id("add-to-cart-button-53")).click();
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		boolean photo = driver.findElement(By.linkText("3rd Album")).isDisplayed();
		if (photo == true) {
			Reporter.log("Photo is displayed in Add to cart", true);
		} else {
			Reporter.log("Photo is not displayed in Add to cart", true);
		}
		Reporter.log("=====================================", true);
		Thread.sleep(2000);
	}

	@Test(priority = 7)
	public void Jewelley() throws InterruptedException {
		driver.findElement(By.xpath("(//a[@href='/jewelry'])[1]")).click();
		boolean jewellery = driver.findElement(By.xpath("//h1[text()='Jewelry']")).isDisplayed();
		if (jewellery == true) {
			Reporter.log("jewellery page is displayed", true);
		} else {
			Reporter.log("jewellery page is not displayed", true);
		}
		driver.findElement(By.partialLinkText("Black & White Diamond Heart")).click();
		driver.findElement(By.id("add-to-cart-button-14")).click();
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		boolean chain = driver.findElement(By.linkText("Black & White Diamond Heart")).isDisplayed();
		if (chain == true) {
			Reporter.log("Chain is displayed in Add to cart", true);
		} else {
			Reporter.log("Chain is not displayed in Add to cart", true);
		}
		Reporter.log("=====================================", true);
		Thread.sleep(2000);
	}

	@Test(priority = 8)
	public void Giftcard() throws InterruptedException {
		driver.findElement(By.xpath("(//a[@href='/gift-cards'])[1]")).click();
		boolean gift = driver.findElement(By.xpath("//h1[text()='Gift Cards']")).isDisplayed();
		if (gift == true) {
			Reporter.log("Gift Cards page is displayed", true);
		} else {
			Reporter.log("Gift Cards is not displayed", true);
		}
		driver.findElement(By.partialLinkText("$5 Virtual Gift Card")).click();
		driver.findElement(By.id("giftcard_1_RecipientName")).sendKeys("Amarendra Sahoo");
		driver.findElement(By.id("giftcard_1_RecipientEmail")).sendKeys("ama123@gmail.com");
		driver.findElement(By.id("add-to-cart-button-1")).click();
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		boolean card = driver.findElement(By.linkText("$5 Virtual Gift Card")).isDisplayed();
		if (card == true) {
			Reporter.log("Gift card is displayed in Add to cart", true);
		} else {
			Reporter.log("Gift card is not displayed in Add to cart", true);
		}
		Reporter.log("=====================================", true);

		Thread.sleep(4000);
		driver.quit();
	}

}
