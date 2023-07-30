package com.Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_Driver {
	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\venka\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver D =new ChromeDriver();
		D.manage().window().maximize();
		D.get("https://www.amazon.in/ref=nav_logo");
		D.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		D.findElement(By.name("email")).sendKeys("9952767768");
		D.findElement(By.id("continue")).click();
		D.findElement(By.name("password")).sendKeys("");
		D.findElement(By.id("signInSubmit")).click();
		Thread.sleep(5000);
		TakesScreenshot Ts = (TakesScreenshot) D;
		File Src = Ts.getScreenshotAs(OutputType.FILE);
		File Des = new File("C:\\Users\\venka\\eclipse-workspace\\Selenium\\Snapshot\\Img.png");
		FileUtils.copyFile(Src, Des);
		Thread.sleep(3000);
		D.findElement(By.xpath("//a[contains(text(),'resh')]")).click();
		Thread.sleep(3000);
		File Src1 = Ts.getScreenshotAs(OutputType.FILE);
		File Des1 = new File("C:\\Users\\venka\\eclipse-workspace\\Selenium\\Snapshot\\Img1.png");
		FileUtils.copyFile(Src1, Des1);
		D.close();
	
	}

}
