package co.testautomation.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	Properties properties;
	
	public ConfigDataProvider() {
		
		File src = new File("./Config/Config.properties");
		
		try {
			FileInputStream fileInputStream = new FileInputStream(src);
			
			properties = new Properties();
			
			properties.load(fileInputStream);
		} catch (Exception e) {
			System.out.println("Not able to load config file >> " + e.getMessage());
		}
	}
	
	public String getDataFromConfig(String keyToSearch) {
		return properties.getProperty(keyToSearch);
	}
	
	public String getBrowser() {
		return properties.getProperty("Browser");
	}
	
	public String getStagingUrl() {
		return properties.getProperty("baseUrl");
	}
}
