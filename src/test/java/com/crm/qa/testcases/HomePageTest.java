package com.crm.qa.testcases;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase{
	LoginPage loginPage;
	HomePage homepage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homepage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}	

	
	@Test(priority=1)
	public void homepageTitleTest() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.titleIs("Facebook"));
		String actualHomeTitle = homepage.getHomePageTitle();
		Assert.assertEquals(actualHomeTitle, "Facebook");
	}
	@Test(priority=2)
	public void verifyUserNameTest() {
		String uName = homepage.varifyUserName();
		Assert.assertEquals(uName, "James Patel");
	}
	@Test(priority=3)
	public void contactTextTest() {
		homepage.friendIconClick();
		driver.navigate().back();
		Assert.assertTrue(homepage.contactsTextPresent());
	}
//	@Test
	
@AfterMethod
public void teardown() {
	driver.quit();
}
}
