package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends DriverSetup {

	@FindBy(id = "email")
	WebElement emailLocator;
	
	
	@FindBy(how = How.ID, using = "password")
	WebElement passwordLocator;
	
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/div[1]/div/form/div[4]/div/button")
	WebElement clickOnLoginBtnLocator;
	
	
	
	
	public void email(String sendEmail) {
		emailLocator.sendKeys(sendEmail);
	}
	
	public void password(String sendPass) {
		emailLocator.sendKeys(sendPass);
	}
	
	
   public void clickOnLogin() {
	   clickOnLoginBtnLocator.click();
   }
	
	
}
