package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.constants.AppConstants;
import com.qa.opencart.utils.ElementUtil;

public class AccountsPage1 {
	
	private WebDriver driver;
	private ElementUtil eleUtil;
	
	// 1. Private By Locators

		//private By logoutLink = By.linkText("Logout");
		private By myAccountLink = By.linkText("My Account");
		//private By headers = By.cssSelector("div#content h2");
		private By search = By.name("search");
		private By searchIcon = By.cssSelector("div#search button");
		
		private By logoutLink = By.linkText("Logout");
		
		private By headers = By.cssSelector("div#search button");
		
		
		//2. public page class constructor
		
		public AccountsPage1(WebDriver driver)
		{
			this.driver=driver;
			eleUtil = new ElementUtil(driver);
		}
		
		
	//3. public page actions/methods
		
		public String getAccPageTitle()
		{
			String title = eleUtil.waitForTitleIs(AppConstants.ACCOUNTS_PAGE_TITLE, 5);
			return title;
		}
		
		
		
		
		
		
		
		
		
		
	
	
	

}
