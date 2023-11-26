package com.magicbricks.configs;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
	
	private Properties props;
	private FileReader fileReader;
	
	public ConfigFileReader() {
		try 
		{
			fileReader = new FileReader("src/test/resources/configs/application.properties");
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		try 
		{
			props = new Properties();
			props.load(fileReader);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String getDriverPath() {
		return props.getProperty("driverPath");
	}
	
	public String getDriverName() {
		return props.getProperty("driverName");
	}
	
	public String getUrl() {
		return props.getProperty("url");
	}
	
	public String getBrowser() {
		return props.getProperty("browser");
	}

}
