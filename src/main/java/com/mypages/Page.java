package com.mypages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {
	
	WebDriver driver;
	WebDriverWait wait;
	
	//now create constructor for this abstract class. 
	
	public Page(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 15); //implicit wait
	}
	
	//abstract methods 
	public abstract String getPageTitle(); 
	//abstract methods should not contain body and 
	//abstract class can have both abstract methods and non abstract methods
	public abstract String getPageHeader(By locator);
	public abstract WebElement getElement(By locator);
	public abstract void waitForWebElement(By locator);
	public abstract void waitForPageTitle(String Title);
	
	public <TPage extends BasePage> TPage getInstance(Class<TPage> pageClass) {
		try {
			return pageClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	

}
