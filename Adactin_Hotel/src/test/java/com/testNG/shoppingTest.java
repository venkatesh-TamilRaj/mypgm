package com.testNG;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.TestNGException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class shoppingTest {
	

@BeforeSuite
private void setProperty() {
	System.out.println("set property");
// TODO Auto-generated method stub

}
@BeforeTest
private void browseLaunch() {
	// TODO Auto-generated method stub
	//WebDriver D = new ChromeDriver();
	System.out.println("Browser launch");
	

}

@BeforeClass
private void urlLaunch() {
	// TODO Auto-generated method stub
	System.out.println("Url launch");
}

@BeforeMethod
private void login() {
	// TODO Auto-generated method stub
	System.out.println("login");
}
	
  @Test
  public void shirtSearch() {
	  
	  System.out.println("Searching Shirt");
  }
  @Test(priority = -2,invocationCount = 5)

  
  private void dressSearch() {
	// TODO Auto-generated method stub
	  System.out.println("Searching Dress");
}
 @Test
  @Ignore
 private void mobile() {
	// TODO Auto-generated method stub
	  System.out.println("Buy Mobile");

}
  @Test (dependsOnMethods = "mobile")
  private void charger() {
	// TODO Auto-generated method stub
	  System.out.println("Buy Charger");

}
  @AfterMethod
  private void logOut() {
	// TODO Auto-generated method stub
System.out.println("logout");
}
  @AfterClass
  private void mainPage() {
	// TODO Auto-generated method stub
	  System.out.println("mainpage");

}
  @AfterTest
  private void closeBrowswer() {
	// TODO Auto-generated method stub
	  System.out.println("close Browser");

}
  @BeforeSuite

  private void Cookies_Clear() {
	// TODO Auto-generated method stub
System.out.println("cookies cleared");
}
  
}
