package co.testautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterSuccessPage {
	WebDriver webDriver;
	
	public RegisterSuccessPage(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	@FindBy (xpath = "//a[contains(text(), 'sign-in')]") WebElement signInLink;
	public @FindBy (xpath = "//font[contains(text(), 'Thank you for registering.')]") WebElement successMsg;
	
	public void navigateToSignIn() {
		signInLink.click();
	}
	
}
