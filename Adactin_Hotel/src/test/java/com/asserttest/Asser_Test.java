package com.asserttest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;
import org.testng.annotations.Test;

import com.retry.Retry_Analyse;

import dev.failsafe.internal.util.Assert;

public class Asser_Test {
	
	
	
	@Test(retryAnalyzer = Retry_Analyse.class)
	
	private void Assert() {
		
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\venka\\eclipse-workspace\\Mini_project\\Driver\\chromedriver.exe");
		WebDriver D = new ChromeDriver();
		D.manage().window().maximize();
		D.get("http://automationpractice.com/index.php");
		
		
		
		

	}

}
