package com.MultiBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.testng.TestNGException;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multi_Browser {
	
	public WebDriver D;
	@Parameters("Browser")
	
	
	@Test(expectedExceptions = TestNGException.class )
	private void fireFox(String Browser) {
		// TODO Auto-generated method stub
		
if (Browser.equals("FireFox")) {
			
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\venka\\eclipse-workspace\\Adactin_Hotel\\driver\\geckodriver.exe");
			WebDriver D = new FirefoxDriver();
			D.manage().window().maximize();
			D.get("http://automationpractice.com/index.php");	
			
	
}
	}
	
	@Parameters("Browser")
	@Test(expectedExceptions = TestNGException.class )
	private void chromeBrowser(String Browser) {
		
		 if (Browser.equals("Chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\venka\\eclipse-workspace\\Adactin_Hotel\\driver\\chromedriver.exe");
				WebDriver D = new ChromeDriver();
				D.manage().window().maximize();
				D.get("http://automationpractice.com/index.php");
				
				
		 }
	

	}

	
}
