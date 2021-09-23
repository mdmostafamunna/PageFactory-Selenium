package testCase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.DriverSetup;
import pages.LoginPage;

public class VerifyLogin extends DriverSetup{
	
	@Test
	public void verifiedLogin() {
		driver.get(baseUrl);
		
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		
		login.email("superadmin@gmail.com");
		login.password("superadmin");
		login.clickOnLogin();
		
		
	}

}
