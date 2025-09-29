package com.facebook.genericPage;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MasterPage {
	
	public static WebDriver driver;
	public Properties prop;
	public Properties or;
	public Properties td;
	
	// constructor Implementation
	public MasterPage() throws IOException {
		
		// Configuration properties file Implementation
		FileInputStream ip = new FileInputStream(".\\src\\com\\facebook\\repository\\config.properties");
		prop = new Properties();
		prop.load(ip);
		
		// Locators properties file Implementation
		FileInputStream fs = new FileInputStream(".\\src\\com\\facebook\\repository\\locators.properties");
		or = new Properties();
		or.load(fs);
		
		// testdata properties file Implementation
		FileInputStream ts = new FileInputStream(".\\src\\com\\facebook\\repository\\testdata.properties");
		td = new Properties();
		td.load(ts);
		
		// Launching Browsers
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", ".\\src\\com.facebook.drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", ".src\\com.facebook.drivers\\edgedriver.exe");
			driver= new EdgeDriver();
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.geckodriver.driver", ".\\src\\com.facebook.drivers.geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("No Browser Details Found");
		}	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(prop.getProperty("url"));
     }
}
