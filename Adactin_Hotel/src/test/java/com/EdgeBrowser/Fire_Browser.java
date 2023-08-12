package com.EdgeBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fire_Browser {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\venka\\eclipse-workspace\\Adactin_Hotel\\driver\\geckodriver.exe");
		WebDriver D = new FirefoxDriver();
		D.manage().window().maximize();
		D.get("http://automationpractice.com/index.php");	
}
}
