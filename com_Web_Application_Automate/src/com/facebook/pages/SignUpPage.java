package com.facebook.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.facebook.genericPage.CommonMethods;

public class SignUpPage extends CommonMethods {

	public SignUpPage() throws IOException {
		super();
	}

	// Get Page Title
	public String getPageTitle() {
		return driver.getTitle();
	}

	// click on create new account
	public void createNewAccount() {
		clickWebElement("createnewaccount");
		handleLogger("SignUpPage", "clicked create new account button");
	}

	// click on first name field
	public void clickFirstName() {
		clickWebElement("firstname");
		handleLogger("SignUpPage", "Clicked first name field");
	}

	// Enter first name
	public void enterFirstName() {
		enterData("firstname", "TestData3");
		handleLogger("SignUpPage", "First Name Entered");
	}

	// click on last name field
	public void clickLastName() {
		clickWebElement("lastname");
		handleLogger("SignUpPage", "Clicked last name field");
	}

	// Enter last name
	public void enterLastName() {
		enterData("lastname", "TestData4");
		handleLogger("SignUpPage", "Last Name Entered");
	}

	// Clear first name field
	public void clearFirstName() {
		clearData("firstname");
		handleLogger("SignUpPage", "first name field cleared");
	}

	// Clear first name field
	public void clearLastName() {
		clearData("lastname");
		handleLogger("SignUpPage", "last name field cleared");
	}

	// select day from the list
	public void selectDay() {
		selectDropdownValue("day", "dayselect");
		handleLogger("SignUpPage", "day selected");
	}

	// select month from the list
	public void selectMonth() {
		selectDropdownValue("month", "monthselect");
		handleLogger("SignUpPage", "month selected");
	}

	// select year from the list
	public void selectYear() {
		selectDropdownValue("year", "yearselect");
		handleLogger("SignUpPage", "month selected");
	}

	// select radio button
	public void selectGender() {
		selectRadioButton("selectgender", "gender");
		handleLogger("SignUpPage", "Gender selected");

	}

	// enter mobile number or email address
	public void enterMobileNoEmail() {
		enterData("mobilenoemail", "monoemailaddress");
		handleLogger("SignUpPage", "Mobile Number or Email Address Entered");
	}

	// enter New Password
	public void enterNewPassword() {
		enterData("newpassword", "npassword");
		handleLogger("SignUpPage", "New Password Entered");
	}

	// click on Sign Up
	public void clickSignUp() {
		clickWebElement("signup");
		handleLogger("SIgnUpPage", "Clicked on the SignUp");
	}

	// Get Active links of sign up Page
	public void activeLinksSignUp() {
		List<WebElement> signuplinks = driver.findElements(By.tagName("a"));
		int spl = signuplinks.size();
		System.out.println("Total Active links on sign up page " + spl);
	}
}
