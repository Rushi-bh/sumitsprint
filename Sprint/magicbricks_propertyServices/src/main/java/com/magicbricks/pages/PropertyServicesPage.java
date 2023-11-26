package com.magicbricks.pages;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PropertyServicesPage extends BasePage{
	
	private WebDriver driver;
	private Actions action;
	
	@FindBy(xpath = "//a[@href=\"https://www.magicbricks.com/homeloan/home?inc=propservices_homepage_topicon\"]")
	WebElement ele_homeLoan;
	
	@FindBy(xpath = "//a[@href=\"https://www.magicbricks.com/decor/?inc=propservices_web\"]")
	WebElement ele_homeInteriors;
	
	@FindBy(xpath = "//a[@href=\"https://www.magicbricks.com/propertyservices/pay-property-rent-online.html?inc=propservices_homepage_topicon\"]")
	WebElement ele_payRent;
	
	@FindBy(xpath =  "//a[@href=\"https://www.magicbricks.com/propertyservices/property-valuation?inc=propservices_homepage_topicon\"]")
	WebElement ele_propertyValuation;
	
	@FindBy(xpath = "//a[@href=\"https://www.magicbricks.com/rentalagreement/index.html?inc=propservices_homepage_topicon\"]")
	WebElement ele_rentAgreement;
	
	@FindBy(xpath = "//a[@href=\"https://www.magicbricks.com/propertyservices/packers-and-movers?inc=propservices_homepage_topicon\"]")
	WebElement ele_packers;
	
	@FindBy(xpath = "//h1[text() = 'Property Services']")
	public WebElement ele_title;
	
	private List<WebElement> ele_list;
	
	public PropertyServicesPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		action = new Actions(driver);
		PageFactory.initElements(driver, this);
		
		ele_list = Arrays.asList(ele_homeLoan,ele_homeInteriors,ele_payRent,ele_propertyValuation,ele_rentAgreement,ele_packers);
		
	}
	
	public void hoverAll() {
		 for(WebElement element: ele_list) {
			 action
			 .moveToElement(element)
			 .perform();
			 try 
			 {
				Thread.sleep(1000);
			 } 
			 catch (InterruptedException e) 
			 {
				e.printStackTrace();
			 }
		 }
	}
	
	public PackersAndMoversPage viewPackers() {
		ele_packers.click();
		return new PackersAndMoversPage(driver);
	}

}
