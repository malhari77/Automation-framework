package com.facebook.tests;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.facebook.genericPage.MasterPage;
import com.facebook.pages.SignUpPage;

public class SignUpTest {
	
	@Test
	public void signUpTest() throws IOException, Exception {
		
		SignUpPage sup = new SignUpPage();
		
		sup.createNewAccount();
		Thread.sleep(2000);
		sup.clickFirstName();
		Thread.sleep(2000);
		sup.clickLastName();
		Thread.sleep(2000);
		sup.enterFirstName();
		Thread.sleep(2000);
		sup.enterLastName();
		Thread.sleep(2000);
		sup.clearFirstName();
		Thread.sleep(2000);
		sup.clearLastName();	
		Thread.sleep(2000);
	}
	
	@AfterClass
	public void closeSignUpPage() {
		MasterPage.driver.close();
	}
	
}


