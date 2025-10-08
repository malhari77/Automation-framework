package com.facebook.tests;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.facebook.genericPage.MasterPage;
import com.facebook.pages.LoginPage;

public class LoginTest {

	@Test(enabled = false, priority = -1, groups = { "Sanity" })
	public void loginTest() throws Exception {

		LoginPage lp = new LoginPage();

		lp.clickEmail();
		lp.enterEmail();
		lp.clickPassword();
		lp.enterPassword();
		// lp.getFacebookText();
		Thread.sleep(2000);
		lp.clearEmail();
		Thread.sleep(2000);
		lp.clearPassword();
		Thread.sleep(2000);
		lp.readExcelData("EmailorPhone", 2, 3, "ExcelTestDataSheetName");
		Thread.sleep(2000);
		lp.readExcelData("Password", 3, 3, "ExcelTestDataSheetName");
		lp.clickLoginButton();
	}

	@AfterMethod
	public void takescreenshot(ITestResult result2) throws Exception {
		LoginPage lp = new LoginPage();
		lp.captureScreenshot(result2);
	}

	@AfterClass
	public static void closeLoginPage() {
		MasterPage.driver.close();
	}

	@Test(priority = -2, groups = {"Sanity"})
	public void getLinks() throws Exception {
		LoginPage lp = new LoginPage();
		lp.getActiveLinks();
	}

}
