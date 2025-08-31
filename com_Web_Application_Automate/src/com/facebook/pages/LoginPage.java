package com.facebook.pages;

import java.io.IOException;

import com.facebook.genericPage.CommonMethods;

public class LoginPage extends CommonMethods {

	public LoginPage() throws IOException {
		super();	
	}
	
	// Click on email field
	public void clickEmail() {
		clickWebElement("EmailorPhone");
		handleLogger("LoginPage", "Clicked Email Field");
	}
	
	// Enter email
	public void enterEmail() {
		enterData("EmailorPhone", "TestData1");
		handleLogger("LoginPage", "Entered Email");
	}
	
	// Clear email
	public void clearEmail() {
		clearData("EmailorPhone");
		handleLogger("LoginPage", "Cleared Email Field");
	}
	
	// Click on Password Field
	public void clickPassword() {
		clickWebElement("Password");
		handleLogger("LoginPage", "Clicked Password Field");
	}
	
	// Enter Password
	public void enterPassword() {
		enterData("Password", "TestData2");
		handleLogger("LoginPage", "Entered Password");
	}
	
	// Clear Password Field
	public void clearPassword() {
		clearData("Password");
		handleLogger("LoginPage", "Cleared Password Field");
	}
	
	//Get Facebook Text
	public void getFacebookText() {
		getWebElementText("FacebookText");
		handleLogger("LoginPage", "Fetched Facebook Text");
	}
	
	// Click on Login Button
	public void clickLoginButton() {
		clickWebElement("LoginButton");
		handleLogger("LoginPage", "Clicked Login Button");
	}

}
