package webDriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureSessionId9 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://baskinrobbinsindia.com/");
		Thread.sleep(2000);
		String sessionId = driver.getWindowHandle();// 32 Alphanumericvalues unique id generated
		System.out.println(sessionId);//DD8BD1CDEBBDF5F172EA1A1A52BBBA2A

	}

}
