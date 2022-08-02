package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homepage;
	
	public LoginPageTest() {
		super();
	}

	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		
	}
	
	
	@Test (priority=1)
	public void titleTest() {
	String title = loginPage.validateLoginPageTitle();
	System.out.println(title);
	Assert.assertEquals(title, "Facebook - log in or sign up");
	}
	
	@Test (priority=2)
	public void fbLogoTest() {
	boolean fbLogo = loginPage.validateFbLogo();
	Assert.assertTrue(fbLogo);
	}
	
	@Test (priority=3)
	public void LoginTest() {
	homepage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
