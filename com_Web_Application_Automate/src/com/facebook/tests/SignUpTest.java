package com.facebook.tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.facebook.genericPage.MasterPage;
import com.facebook.pages.SignUpPage;

public class SignUpTest {

	@Test(enabled = false, priority = 0, groups = { "Smoke" })
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
		// sup.clearFirstName();
		Thread.sleep(2000);
		// sup.clearLastName();
		Thread.sleep(2000);
		sup.selectDay();
		Thread.sleep(2000);
		sup.selectMonth();
		Thread.sleep(2000);
		sup.selectYear();
		Thread.sleep(2000);
		sup.selectGender();
		Thread.sleep(2000);
		sup.enterMobileNoEmail();
		Thread.sleep(2000);
		sup.enterNewPassword();
		Thread.sleep(2000);
		sup.clickSignUp();
		Thread.sleep(2000);
	}

	// page title
	@Test(priority = -1, groups = { "Smoke" })
	public void signUpTitle() throws Exception {

		SignUpPage sup = new SignUpPage();

		String actualTitle = "Facebook – log in or sign up ";
		String expectedTitle = sup.getPageTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Actual & expected title is match");
		System.out.println(actualTitle);
		System.out.println(expectedTitle);
	}

	// Active links for sign up page
	@Test(priority = 0, groups = { "Smoke" })
	public void signUpLinks() throws Exception {
		SignUpPage sup = new SignUpPage();
		sup.activeLinksSignUp();
	}

	@AfterClass
	public void closeSignUpPage() {
		MasterPage.driver.close();
	}

}
