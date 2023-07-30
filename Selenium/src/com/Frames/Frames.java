package com.Frames;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FileUtilsCopyToFileTestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\venka\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver D =new ChromeDriver();
		D.manage().window().maximize();
		D.get("http://demo.automationtesting.in/Frames.html");
		D.switchTo().frame("singleframe");
		D.findElement(By.tagName("input")).sendKeys("venkat");
		D.switchTo().parentFrame();
		D.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		D.switchTo().frame(1);
	    D.switchTo().frame(0);
	    D.findElement(By.xpath("//input[@type='text']")).sendKeys("venkat");
	    D.switchTo().defaultContent();
	    D.findElement(By.xpath("//a[text()='Practice Site']")).click();
	    TakesScreenshot Ts= (TakesScreenshot) D;
	    File Src = Ts.getScreenshotAs(OutputType.FILE);
	    File Des = new File("C:\\Users\\venka\\eclipse-workspace\\Selenium\\Snapshot\\frame.png");
	    FileUtils.copyDirectory(Src, Des);
	    
		

}
}
