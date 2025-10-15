package com.facebook.pages;

import java.io.IOException;

import com.facebook.genericPage.CommonMethods;

public class createUser extends CommonMethods {

	public createUser() throws IOException {
		super();

	}

	// click of admin
	public void clickAdmin() {
		clickWebElement("admin");
		handleLogger("createUser", "Admin clicked");

	}

	// click on add button
	public void clickOnAdd() {
		clickWebElement("add");
		handleLogger("createUser", "click on add button");
	}

	// select user role
	public void userRole() {
		selectDropdownValue("userrole", "urole");
		handleLogger("createUser", "user role selected");
	}
	
	// Enter emp. name
	public void enterEmployeeName() {
		enterData("employeeName", "EmpName");
		handleLogger("createUser", "employee name entered");
	}
	
	// 

}
