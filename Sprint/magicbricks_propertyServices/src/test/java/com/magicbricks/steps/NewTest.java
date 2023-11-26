package com.magicbricks.steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
	@Test
	public void Select() throws InterruptedException {

	      WebDriverManager.chromedriver().setup();

	      WebDriver driver = new ChromeDriver();

	 

	      driver.get("https://www.spicejet.com/");

	      

	      driver.manage().window().maximize();

	      //Hotels

	      driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-ubezar r-16dba41 r-1pzd9i8']")).click();
	      driver.get("https://www.spicejet.com/");
	      
	    //Gift Card

	      Thread.sleep(1000);

	      driver.findElement(By.xpath("//a[@data-testid='test-id-Gift Card']")).click();
	      Thread.sleep(2000);
	      driver.navigate().to("https://www.spicejet.com/");
	      Thread.sleep(2000);
	      //spice screen
	      System.out.println(driver.getCurrentUrl());
	      Thread.sleep(3000);

	      new WebDriverWait(driver, Duration.ofSeconds(0)) driver.findElement(By.xpath("//a[@content='external-tag']")).click();
	      
	      Thread.sleep(2000);
	      driver.navigate().to("https://www.spicejet.com/");
	      Thread.sleep(2000);
	      //cargo

	      Thread.sleep(1000);

	      driver.findElement(By.xpath("//a[@data-testid='test-id-Cargo']")).click();
	      Thread.sleep(2000);
	      driver.navigate().to("https://www.spicejet.com/");
	      Thread.sleep(2000);
	      //charter

	      Thread.sleep(2000);

	      driver.findElement(By.xpath("//a[@data-testid='test-id-Charter']")).click();
	      }
	}
