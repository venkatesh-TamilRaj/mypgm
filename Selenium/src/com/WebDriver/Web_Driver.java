package com.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Driver {
	
	public static void main(String[] args) throws InterruptedException {                       //java.lang.IllegalStateException
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\venka\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver D = new ChromeDriver();
		D.manage().window().maximize();
		D.get("https://www.flipkart.com/");
		String currentUrl = D.getCurrentUrl();
		System.out.println(currentUrl);                                                            //org.openqa.selenium.WebDriverException:
		Thread.sleep(3000);
		D.navigate().to("https://www.amazon.in/ref=nav_logo");
		String title = D.getTitle();                                                               // org.openqa.selenium.NoSuchWindowExceptio
		System.out.println(title); 
		D.navigate().back();
		D.navigate().forward();
		Thread.sleep(3000);
		D.navigate().refresh();
		D.close();
		
		
	}
	
	
}
