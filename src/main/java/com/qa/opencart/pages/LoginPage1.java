package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.constants.AppConstants;
import com.qa.opencart.logger.Log;
import com.qa.opencart.utils.ElementUtil;
import com.qa.opencart.utils.TimeUtil;

import io.qameta.allure.Step;

public class LoginPage1 {
	
	//PageClass/PageLibrary/page object
	
	private WebDriver driver;
	private ElementUtil eleUtil;
	
	//1. Private By Locator
	
	private By emailId = By.id("input-email");
	private By password = By.id("input-password");
	private By loginButton = By.xpath("//input[@value='Login']");
	private By forgotPWdLink = By.linkText("Forgotten Password");
	private By registerLink = By.linkText("Register");
	
	
	
	//2. Public page class constructor
	
	public LoginPage1(WebDriver driver) {
		this.driver=driver;	
		eleUtil = new ElementUtil(driver);
	}
	
	
		// 3. Public page Actions /Methods
	
	@Step("getting login page title...")
	
       public String getLoginPageTitle1()
        {
		String title = eleUtil.waitForTitleIs(AppConstants.LOGIN_PAGE_TITLE, TimeUtil.DEFAULT_MEDIUM_TIME);
		Log.info("LoginPageTitle :" +title);
			return title;	
	}
	
	@Step("login with username: {0} and password: {1}")
	public AccountsPage doLogin(String username, String pwd) {
		System.out.println("user creds: " + username + " : " + pwd);
		eleUtil.waitForElementVisible(emailId, TimeUtil.DEFAULT_LONG_TIME).sendKeys(username);
		eleUtil.doSendKeys(password, pwd);
		eleUtil.doClick(loginButton);
		return new AccountsPage(driver);
	}
	
	@Step("Login with username and password")
	public AccountsPage doLogin1(String username, String pwd)
	{
		eleUtil.waitForElementVisible(emailId, TimeUtil.DEFAULT_LONG_TIME).sendKeys(username);
		eleUtil.doSendKeys(password, pwd);
		eleUtil.doClick(loginButton);
		return new AccountsPage(driver);
	}
	
	@Step ("Navigate to registration page")
	public RegisterationPage navigateToRegisterPage1()
	{
		eleUtil.waitForElementVisible(registerLink, TimeUtil.DEFAULT_LONG_TIME).click();
		return new RegisterationPage(driver);
	}
	
	
}
