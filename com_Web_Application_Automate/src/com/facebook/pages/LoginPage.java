package com.facebook.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.facebook.genericPage.CommonMethods;

public class LoginPage extends CommonMethods {
	
	
	
	public LoginPage() throws IOException {
		super();
	}

	// Click on UserName field
	public void clickEmail() {
		clickWebElement("Username");
		handleLogger("LoginPage", "Clicked user name Field");
	}

	// Enter UserName
	public void enterEmail() {
		enterData("Username", "TestData1");
		handleLogger("LoginPage", "Entered Email");
	}

	// Clear UserName
	public void clearEmail() {
		clearData("Username");
		handleLogger("LoginPage", "Cleared UserName Field");
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

	// Get Login Page Text
	public void getFacebookText() {
		getWebElementText("FacebookText");
		handleLogger("LoginPage", "Fetched Facebook Text");
	}

	// Click on Login Button
	public void clickLoginButton() {
		clickWebElement("LoginButton");
		handleLogger("LoginPage", "Clicked Login Button");
	}
	
	// Click on profile 
	public void profileClick() {
		clickWebElement("profileclick");
		handleLogger("LoginPage", "Profile clicked");
	}
	
	// Click logout button
	public void clickLogout() {
		clickWebElement("logout");
		handleLogger("LoginPage", "Logout clicked");
	}

	// Active links
	public void getActiveLinks() {
		List<WebElement> list = driver.findElements(By.tagName("a"));
		int links = list.size();
		System.out.println("Total available links on login Page " + links);

	}
}
