package com.JsExec;

import java.awt.Dimension;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jsexec {
	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\venka\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver D =new ChromeDriver();
		D.manage().window().maximize();
		//Dimension d =new Dimension(100,100);
		//D.manage().window().getSize(d);
		D.get("https://www.snapdeal.com/");
		JavascriptExecutor Js = (JavascriptExecutor) D;
		Js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		TakesScreenshot Ts = (TakesScreenshot) D;
		File Src1 = Ts.getScreenshotAs(OutputType.FILE);
		File Des1 = new File("C:\\Users\\venka\\eclipse-workspace\\Selenium\\Snapshot\\Img1.png");
		FileUtils.copyFile(Src1, Des1);
		Thread.sleep(3000);
		Js.executeScript("window.scrollBy(0,4000)");
		Thread.sleep(3000);
		WebElement scroll = D.findElement(By.xpath("//i[@class='back-to-top-icon backTopImg']"));
		Js.executeScript("arguments[0].click();", scroll);
		Thread.sleep(3000);
		D.close();
		
	}

}
