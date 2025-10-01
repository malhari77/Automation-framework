package com.facebook.pages;

import java.io.IOException;

import com.facebook.genericPage.CommonMethods;

public class SignUpPage extends CommonMethods {

	public SignUpPage() throws IOException {
		super();
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
		enterData("lastname","TestData4");
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
}
