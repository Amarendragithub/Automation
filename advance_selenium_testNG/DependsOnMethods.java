package advance_selenium_testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods {

	@Test
	public void createAccount() {
		
		Reporter.log("Account Created Successfully", true);
	}

	// @Test(dependsOnMethods = "createAccount")
	@Test
	public void editAccount() {
		Reporter.log("Account edited Successfully", true);
	}

	@Test//(dependsOnMethods = { "deleteAccount", "createAccount" })
	public void deleteAccount() {
		Reporter.log("Account deleted Successfully", true);
	}

}
