package com.facebook.pages;

import java.io.IOException;

import com.facebook.genericPage.CommonMethods;

public class LoginPage extends CommonMethods {

	public LoginPage() throws IOException {
		super();	
	}
	
	// 
	
	
	
	//Get Facebook Text
	public void getFacebookText() {
		getWebElementText("FacebookText");
	}
	
	// Click on password field
	public void clickPasswordField() {
		clickWebElement("Password");
	}

}
