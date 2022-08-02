package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	
	// PageFactory -- OR
	
	@FindBy (xpath="//span[contains(text(),'James Patel')]")
	WebElement profileLink;
	
	@FindBy(xpath= "//span[contains(text(),'Friends')]")
	WebElement friendsLink;

	@FindBy(xpath="//a[@aria-label='Marketplace']")
	WebElement marketIcon;
	
	@FindBy (xpath="//span[contains(text(),'Marketplace')]")
	WebElement marketLink;
	
	@FindBy (xpath="//span[contains(text(),'Contacts')]")
	WebElement contactsTextChat;
	
	@FindBy(xpath="//a[@aria-label='Friends']")
	WebElement friendIcon;
	
	// initializing the page objects
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	} 
	
	// Actions
	
	public boolean contactsTextPresent() {
		return contactsTextChat.isDisplayed();
	}
	
	public String varifyUserName() {
		return profileLink.getText();
	}
	
	public String getHomePageTitle() {
		return driver.getTitle();
	}
	
	public MarketplacePage clickOnMarketLink() {
		marketLink.click();
		return new MarketplacePage();
	}
	
	public MarketplacePage clickOnMarketIcon() {
		marketIcon.click();
		return new MarketplacePage();
	}
	
	public FriendsPage clickOnFriendsLink() {
		 friendsLink.click();
		 return new FriendsPage();
	}
	
	public void friendIconClick() {
		friendIcon.click();
	}
}
