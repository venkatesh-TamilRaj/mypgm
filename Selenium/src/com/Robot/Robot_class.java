package com.Robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.Actions_class.Actions_class;

public class Robot_class {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\venkat\\eclipse-workspace\\Selenium\\Driver\\operadriver.exe");
		WebDriver D = new ChromeDriver();
		D.manage().window().maximize();
		D.get("https://www.gamestheshop.com/");
		WebElement clk = D.findElement(By.linkText("PSN Digital"));
		Actions Act =new Actions(D);
		Act.contextClick(clk).build().perform();
		Robot Rob = new Robot();
	    Rob.keyPress(KeyEvent.VK_DOWN);
	    Rob.keyRelease(KeyEvent.VK_DOWN);
	    Rob.keyPress(KeyEvent.VK_DOWN);
	    Rob.keyRelease(KeyEvent.VK_DOWN);
	    Rob.keyPress(KeyEvent.VK_DOWN);
	    Rob.keyRelease(KeyEvent.VK_DOWN);
	    Thread.sleep(3000);
	    Rob.keyPress(KeyEvent.VK_ENTER);
	    Rob.keyRelease(KeyEvent.VK_ENTER);
	    //shortcut keys
	    Rob.keyPress(KeyEvent.VK_CONTROL);
	    Rob.keyPress(KeyEvent.VK_T);
	    Rob.keyRelease(KeyEvent.VK_CONTROL);
	    Rob.keyRelease(KeyEvent.VK_T);
	   
	
		
	}

}
