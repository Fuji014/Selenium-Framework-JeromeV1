package co.testautomation.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import co.testautomation.utilities.BrowserFactory;
import co.testautomation.utilities.ConfigDataProvider;
import co.testautomation.utilities.ExcelDataProvider;

public class BaseClass {
	public WebDriver webDriver;
	public ExcelDataProvider excel;
	public ConfigDataProvider config;
	
	@BeforeSuite
	public void setupSuite() {
		excel = new ExcelDataProvider();
		config = new ConfigDataProvider();
	}
	
	@BeforeTest
	public void setup() {
		webDriver = BrowserFactory.launchBrowser(webDriver, config.getBrowser(), config.getStagingUrl());
	}
	
	@AfterTest
	public void tearDown() {
		BrowserFactory.terminateBrowser(webDriver);
	}
}
