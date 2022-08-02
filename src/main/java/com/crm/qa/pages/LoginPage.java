package com.crm.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	
	// PageFactory -- OR
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="pass")
	WebElement password;
	
	@FindBy(name="login")
	WebElement loginButton;

	@FindBy(xpath="//img[@class='fb_logo _8ilh img']")
	WebElement fbLogo;
	
	@FindBy(linkText="Forgotten password?")
	WebElement fPassword;
	
	@FindBy(xpath="//a[contains(text(),'Sign Up')]")
	WebElement signUpLink;
	
	// initializing the page objects
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	} 

	// Actions
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateFbLogo() {
		return fbLogo.isDisplayed();
	}
	
	public HomePage login(String un, String pd) {
		email.sendKeys(un);
		password.sendKeys(pd);
		loginButton.click();
		
		return new HomePage();
	}
	
	public void SignupLinkClick() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", signUpLink);
		signUpLink.click();
	}
	
}

