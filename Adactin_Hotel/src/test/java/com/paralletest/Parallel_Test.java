package com.paralletest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel_Test {

	@Test
	private void flipKart() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\venka\\eclipse-workspace\\Adactin_Hotel\\driver\\chromedriver.exe");

		WebDriver D = new ChromeDriver();
		D.manage().window().maximize();
		D.get("https://www.flipkart.com/");

	}
	
	@Test
	private void gooGle() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\venka\\eclipse-workspace\\Adactin_Hotel\\driver\\chromedriver.exe");

		WebDriver D = new ChromeDriver();
		D.manage().window().maximize();
		D.get("https://www.google.com/");

	}

}
