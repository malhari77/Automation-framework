package com.facebook.tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.facebook.genericPage.MasterPage;
import com.facebook.pages.LoginPage;
import com.facebook.pages.createUser;

public class createUserTest extends MasterPage {

	public createUserTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void lauchApplication() {
		SetUp();
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

	@Test(priority = 1, groups = { "Smoke" })
	public void createUser() throws Exception {

		LoginPage lp = new LoginPage();
		lp.clickEmail();
		lp.enterEmail();
		lp.clickPassword();
		lp.enterPassword();
		lp.clickLoginButton();

		createUser cu = new createUser();

		cu.clickAdmin();
		Thread.sleep(2000);
		cu.clickOnAdd();
		cu.userRole();
		cu.enterEmployeeName();
	}
}
