package com.Actions_class;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class MoveToElement {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\venka\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver D = new ChromeDriver();
		D.manage().window().maximize();
		D.get("https://www.amazon.in/");
		Actions Act =new Actions(D);
		JavascriptExecutor Js = (JavascriptExecutor) D;
		WebElement mv = D.findElement(By.xpath("(//span[text()='All'])[2]"));
		Act.moveToElement(mv).click().build().perform();
		TakesScreenshot Ts = (TakesScreenshot) D;
		File Src = Ts.getScreenshotAs(OutputType.FILE);
		File Des = new File("C:\\Users\\venka\\eclipse-workspace\\Selenium\\Snapshot\\Mv.png");
		FileUtils.copyFile(Src, Des);
		D.get("https://demoqa.com/droppable");
		D.findElement(By.xpath("//a[.='Prevent Propogation']")).click();
		WebElement drag = D.findElement(By.id("dragBox"));
		WebElement Drop = D.findElement(By.id("greedyDropBoxInner"));
		Act.dragAndDrop(drag, Drop).build().perform();
		Js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(2000);
		File DrgSrc = Ts.getScreenshotAs(OutputType.FILE);
		File DropDes = new File("C:\\Users\\venka\\eclipse-workspace\\Selenium\\Snapshot\\Drag.png");
		FileUtils.copyFile(DrgSrc, DropDes);
		D.get("https://www.amazon.in/");
		WebElement Search = D.findElement(By.id("twotabsearchtextbox"));
		Search.sendKeys("laptop" + Keys.ENTER);
		
		File Src1 = Ts.getScreenshotAs(OutputType.FILE);
		File Des1 = new File("C:\\Users\\venka\\eclipse-workspace\\Selenium\\Snapshot\\Search.png");
		FileUtils.copyFile(Src1, Des1);
	    D.close();
		
	}

}
