package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	private By username = By.id("username");
	private By pwd = By.id("password");
	private By loginButton = By.name("login");
	private By loginHeader = By.xpath("//*[@id=\"customer_login\"]/div[1]/h2");

	public WebElement getUsername() {
		return getElement(username);
	}

	public WebElement getPwd() {
		return getElement(pwd);
	}

	public WebElement getLogin() {
		return getElement(loginButton);
	}

	public String getLoginHeader() {
		return getElement(loginHeader).getText();
	}

	public String getLoginPageTitle() {
		return getPageTitle();
	}

	public HomePage doLogin(String username, String pwd) {
		getUsername().sendKeys("madhanatchennai@gmail.com");
		getPwd().sendKeys("Di9SuW@X3XDjKFi");
		getLogin().click();
		return getInstance(HomePage.class);
	}
	
	public HomePage doLogin() {
		getUsername().sendKeys("");
		getPwd().sendKeys("");
		getLogin().click();
		return getInstance(HomePage.class);
	}
	
	public HomePage doLogin(String credentials) {
		getUsername().sendKeys("");
		getPwd().sendKeys("");
		getLogin().click();
		return getInstance(HomePage.class);
	}

}
