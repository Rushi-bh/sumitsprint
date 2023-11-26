package com.sprint.task;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestRunner {
	private WebDriver driver;

	@BeforeTest
	public void beforeTest() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://unacademy.com/goal/neet-ug/YOTUH");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}
	
	@Test
	public void test() throws InterruptedException {
//		WebElement checkBox1 = driver.findElement(By.xpath("//label[@for='ctl00_mainContent_chk_friendsandfamily']"));
//		WebElement checkBox2 = driver.findElement(By.xpath("//label[@for='ctl00_mainContent_chk_SeniorCitizenDiscount']"));
//		WebElement checkBox3 = driver.findElement(By.xpath("//label[@for='ctl00_mainContent_chk_IndArm']"));
//		WebElement checkBox4 = driver.findElement(By.xpath("//label[@for='ctl00_mainContent_chk_Ltc']"));
//		WebElement checkBox5 = driver.findElement(By.xpath("//label[@for='ctl00_mainContent_chk_Govt']"));
//		WebElement checkBox6 = driver.findElement(By.xpath("//label[@for='ctl00_mainContent_chk_StudentDiscount']"));
//		WebElement checkBox7 = driver.findElement(By.xpath("//label[@for='ctl00_mainContent_chk_Unmr']"));
//		WebElement checkBox8 = driver.findElement(By.xpath("//label[@for='ctl00_mainContent_chk_Healthcare']"));
//		
//		List<WebElement> checkBoxList = Arrays.asList(checkBox1,checkBox2,checkBox3,checkBox4,checkBox5,checkBox6,checkBox7,checkBox8);
		
////		selecting first check box
//		checkBox1.click();
//		Thread.sleep(1000);
//		checkBox1.click();
////	    selecting second check box
//		checkBox2.click();
//		Thread.sleep(1000);
//		checkBox2.click();
////		selecting third check box
//		checkBox3.click();
//		Thread.sleep(1000);
//		checkBox3.click();
////		selecting fourth check box
//		checkBox4.click();
		
//		driver.findElement(By.linkText("DEALS")).click();
//		driver.findElement(By.linkText("Gift Card")).click();
	
		
//		printing all check box text
//		for(WebElement checkbox: checkBoxList) {
//			System.out.println(checkbox.getText());
//		}
		
        driver.findElement(By.xpath("//h6[@class='h6_variant aquilla-typography typography  css-1uhb9xi']")).click();

        Thread.sleep(3000);

 

        Alert alert = driver.switchTo().alert();

        Thread.sleep(3000);

        String s = alert.getText();

        System.out.println("Alert text is: " + s);

        alert.dismiss();
		
		
		
	}

	@AfterTest
	public void afterTest() {
		//driver.close();
	}

}
