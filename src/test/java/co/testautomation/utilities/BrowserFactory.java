package co.testautomation.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
	public static WebDriver launchBrowser(WebDriver webDriver, String browserName, String baseUrl) {
		
		if(browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			webDriver = new ChromeDriver();
		} else if (browserName.equals("Firefox")) {
			
		} else if (browserName.equals("IE")) {
			
		} else {
			System.out.println("We do not support this browser");
		}
		
		webDriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		webDriver.manage().window().maximize();	
		webDriver.get(baseUrl);
		webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		return webDriver;
	}
	
	public static void terminateBrowser(WebDriver webDriver) {
		webDriver.quit();
	}
}
