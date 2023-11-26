package com.magicbricks.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utils {
	
	public static void takeScreenShot(WebDriver driver, String fileName) throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File file = screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("./Screenshots/"+fileName+".png"));
	} 
	
	

}
