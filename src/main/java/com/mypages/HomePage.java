package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	private By welcomemsg = By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/p[1]/strong"); 
	
	public String getWelcomemsg() {
		return getElement(welcomemsg).getText();
	}
	
	public String getLoginPageTitle() {
		return getPageTitle();
	}
	
	
	
	

}
