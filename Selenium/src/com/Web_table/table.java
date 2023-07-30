package com.Web_table;

import java.awt.Robot;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class table {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\venka\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver D= new ChromeDriver();
		D.manage().window().maximize();
		D.get("http://www.leafground.com/pages/table.html");
		 WebElement table = D.findElement(By.tagName("table"));
		List<WebElement> all = D.findElements(By.xpath("//table/tbody/tr/td"));
	   
		for (int i = 0; i < all.indexOf(all); i++) {
			
			System.out.println(all);
		}
		
			}
	}


