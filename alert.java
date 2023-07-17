package com.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.Driver", "./Driver/chromedriver.exe");
		ChromeDriver Driver = new ChromeDriver();
		Driver.get("https://letcode.in/alert");
		WebElement Btn = Driver.findElement(By.id("prompt"));
		Btn.click();
		Alert alert = Driver.switchTo().alert();
		alert.sendKeys("venkat");
		String text = alert.getText();
		System.out.println(text);
		System.out.println("venkatesh");
	
		
		
		
	}

}
