package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.SignupPage;
import com.crm.qa.util.Xls_Reader;

public class SignupPageTest extends TestBase{
	LoginPage loginPage;
	SignupPage signUpPage;
	Xls_Reader excelReader;
	public SignupPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		signUpPage = new SignupPage();
		excelReader = new Xls_Reader("C:\\Users\\12898\\Desktop\\Selenium_WorkSpace\\PageObject\\src\\main\\java\\com\\crm\\qa\\testdata\\POM Test Data.xlsx");
		
	}
	
	@Test
	public void signUpTest() {
		loginPage.SignupLinkClick();
		signUpPage.enterFormInfo(excelReader.getCellData("Sheet1", 1, 1), excelReader.getCellData("Sheet1", 1, 2), excelReader.getCellData("Sheet1", 1, 3), excelReader.getCellData("Sheet1", 1, 4), excelReader.getCellData("Sheet1", 1, 5), excelReader.getCellData("Sheet1", 1, 6), excelReader.getCellData("Sheet1", 1, 7));
		System.out.println(driver.getTitle());
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
