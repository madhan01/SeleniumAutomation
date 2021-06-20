package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mypages.HomePage;
import com.mypages.LoginPage;

public class LoginTest extends BaseTest {
	
	@Test(priority = 1)
	public void verifyLoginPageTitle() {
		String title = page.getInstance(LoginPage.class).getPageTitle();
		Assert.assertEquals(title, "My Account – Automation Practice Site");
	}
	
	@Test(priority = 2)
	public void verifyLoginPageHeader() {
		String header = page.getInstance(LoginPage.class).getLoginHeader();
		Assert.assertEquals(header, "Login");
	}
	
	@Test(priority = 3)
	public void verifyLogin() {
		HomePage homePage = page.getInstance(LoginPage.class).doLogin("madhanatchennai@gmail.com", "Di9SuW@X3XDjKFi");
		String homeHeader = homePage.getWelcomemsg();
		Assert.assertEquals(homeHeader, "madhanatchennai");
	}
	
}
