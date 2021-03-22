package co.testautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver webDriver;
	
	public LoginPage(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	@FindBy (xpath = "//input[@name='userName']") WebElement username;
	@FindBy (xpath = "//input[@name='password']") WebElement password;
	@FindBy (xpath = "//input[@type='submit']") WebElement submitBtn;
	
	public void fillLoginForm(String username, String password) {
		this.username.sendKeys(username);
		this.password.sendKeys(password);
		this.submitBtn.click();
	}
}
