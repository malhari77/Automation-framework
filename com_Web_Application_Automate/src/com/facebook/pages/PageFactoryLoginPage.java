package com.facebook.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageFactoryLoginPage {
	
	@FindBy(xpath="//input[@id='email']")
	WebElement EmailorPhone;
	
    @FindBy(xpath="//input[@id='pass']")
		WebElement Password;

    public void enteremail() {
	EmailorPhone.sendKeys("abc@gmail.com");
}

    public void enterPassword() {
	Password.sendKeys("12345");
}
}

