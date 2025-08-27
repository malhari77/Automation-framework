package com.facebook.genericPage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods extends MasterPage {

	public CommonMethods() throws IOException {
		super();
	}
	// Get Text to Web Element
	 public void getWebElementText(String xpathkey) {
		String gettextofWebElement = driver.findElement(By.xpath(or.getProperty(xpathkey))).getText();
		System.out.println(gettextofWebElement);
	}
	 
	 // click Method
	 public void clickWebElement(String xpathkey) {
		 driver.findElement(By.xpath(or.getProperty(xpathkey))).click();
	 }
	 
	 // clear method
	 public void clearData(String xpathkey) {
		 driver.findElement(By.xpath(or.getProperty(xpathkey))).clear();
	 }
	
	 // Enter Data
	 public void enterData(String xpathkey, String testData) {
		 driver.findElement(By.xpath(or.getProperty(xpathkey))).sendKeys(td.getProperty(testData));
	 }
	 
	 //Mouse Hover
	 public void moveToElement(String xpathkey) {
		 Actions act = new Actions(driver);
		 act.moveToElement(driver.findElement(By.xpath(or.getProperty(xpathkey)))).build().perform();
	 }
	 
	 // Click of List of Web Element
	 public void clickListElement(String xpathkey, String testdata) {
		 List<WebElement> listofElements = driver.findElements(By.xpath(or.getProperty(xpathkey)));
		 for(int i=0;i<listofElements.size();i++) {
			 if(listofElements.get(i).getText().equalsIgnoreCase(td.getProperty(testdata))) {
				 listofElements.get(i).click();
			 }
		 }
	 }
	 
	 // Select drop down value using visible Text
	 public void selectDropdownValue(String xpathkey, String testdata) {
		 WebElement ele = driver.findElement(By.xpath(or.getProperty(xpathkey)));
		 Select webElem = new Select(ele);
		 webElem.selectByVisibleText(td.getProperty(testdata));
	 }
	 
	 // Read Excel data
	 public void readExcelData(String xpathkey, int rowNo, int columnNo, String excelSheetName) throws Exception {
		 File src = new File(".\\src\\com.facebook.resources\\Excel Test Data.xlsx");
		 FileInputStream fis = new FileInputStream(src);
		 XSSFWorkbook wb = new XSSFWorkbook(fis);
		 XSSFSheet sh = wb.getSheet(prop.getProperty(excelSheetName));
		 System.out.println(sh.getSheetName());
		 String abc = sh.getRow(rowNo).getCell(columnNo).getStringCellValue();
		 driver.findElement(By.xpath(or.getProperty(xpathkey))).sendKeys(abc);
	 }
	 
	 // Handling Explicit Wait -visibilityofElementLocated
	 public void handleExplicitWait_visibilityofElementLocated(String xpathkey, String testdata) {
		 WebDriverWait wt = new WebDriverWait(driver, 30);
		 wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(or.getProperty(xpathkey)))).click();
	 }
	 
}
