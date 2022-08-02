package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class SignupPage extends TestBase {
	
	// PageFactory -- OR
	
	@FindBy(xpath="//input[@aria-label='First name']")
	WebElement firstNameInput;
	
	@FindBy(xpath="//input[@name='lastname']")
	WebElement lastNameInput;
	
	@FindBy(xpath="//input[@name='reg_email__']")
	WebElement emailInput;
	
	@FindBy(id="password_step_input")
	WebElement passwordInput;
	
	@FindBy(xpath="//select[@id='day']")
	WebElement dropDay;
	
	@FindBy(xpath="//select[@id='month']")
	WebElement dropMonth;
	
	@FindBy(xpath="//select[@id='year']")
	WebElement dropYear;
	
	@FindBy(xpath="//input[@name='reg_email_confirmation__']")
	WebElement reenterEmail;
	
	// initializing the page objects
	
	public SignupPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	public void enterFormInfo(String fn, String last, String email, String passIn, String day, String month, String year) {
		firstNameInput.sendKeys(fn);
		lastNameInput.sendKeys(last);
		emailInput.sendKeys(email);
		reenterEmail.sendKeys(email);
		passwordInput.sendKeys(passIn);
//		Select select = new Select(dropDay);
//		select.selectByValue(day);
//		Select select1 = new Select(dropMonth);
//		select1.selectByValue(month);
//		Select select2 = new Select(dropYear);
//		select2.selectByValue(year);
	}
	

}
