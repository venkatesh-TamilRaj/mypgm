package com.BaseClass;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import javax.swing.Spring;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import net.bytebuddy.asm.Advice.Enter;

public class Adactin_base {
	
	public static WebDriver Driver; //null
	
	public static WebDriver getbrowser(String s) { //launch Browser
		// TODO Auto-generated method stub
		
		if (s.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
			Driver= new ChromeDriver();
		}
		return Driver;

	}
	public static  void click(WebElement e ) { //click
		
		e.click();
		// TODO Auto-generated method stub

	}
	public static void enter(WebElement e ,String s) { //send keys 

		e.sendKeys(s);
		// TODO Auto-generated method stub

	}
	public static void geturl(String url) { //get url
		// TODO Auto-generated method stub
		
		Driver.get(url);
		

	}
	
	public static void close() { //quit
		// TODO Auto-generated method stub
		Driver.close();

	}
	
	public static void Wait(int time) {
		
		Driver.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS);
		// TODO Auto-generated method stub

	}
	
	public static void Select(String type ,WebElement e,String data) {
		
		Select s = new Select(e);
		if (type.equalsIgnoreCase("select by value")) {
			
			s.selectByValue(data);
			
		}
		else if (type.equalsIgnoreCase("select by text")) {
			
			s.selectByVisibleText(data);
			
		}
		
	else if (type.equalsIgnoreCase("Select by Index")) {
		
		int index = Integer.parseInt(data);
			
			s.selectByIndex(index);
			
		}
		}
		
		// TODO Auto-generated method stub



}


