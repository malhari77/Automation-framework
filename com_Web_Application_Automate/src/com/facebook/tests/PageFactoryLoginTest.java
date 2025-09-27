package com.facebook.tests;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.facebook.genericPage.CommonMethods;
import com.facebook.pages.PageFactoryLoginPage;

public class PageFactoryLoginTest extends CommonMethods {
	
	
	public PageFactoryLoginTest() throws IOException {
		super();
	}

	@Test
	public void loginTest() {
		PageFactoryLoginPage pfc = PageFactory.initElements(driver, PageFactoryLoginPage.class);
		pfc.enteremail();
		pfc.enterPassword();
		
	}

}
