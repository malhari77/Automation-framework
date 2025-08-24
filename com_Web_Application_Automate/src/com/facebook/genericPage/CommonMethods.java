package com.facebook.genericPage;

import java.io.IOException;

import org.openqa.selenium.By;

public class CommonMethods extends MasterPage {

	public CommonMethods() throws IOException {
		super();
	}
	// Get Text to Web Element
	 public void getWebElementText(String xpathkey) {
		String gettextofWebElement = driver.findElement(By.xpath(or.getProperty(xpathkey))).getText();
		System.out.println(gettextofWebElement);
	}

}
