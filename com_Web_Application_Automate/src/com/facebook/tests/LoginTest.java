package com.facebook.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.facebook.pages.LoginPage;

public class LoginTest {

	@Test
	public void loginTest() throws Exception {
		
	LoginPage lp = new LoginPage();
	
	lp.getFacebookText();
	lp.clickPasswordField();
	
	}
}
