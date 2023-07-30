package com.Actions_class;
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
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
public class Actions_class {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\venka\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver D =new ChromeDriver();
		D.manage().window().maximize();
		D.get("https://demoqa.com/buttons");
		Actions Act =new Actions(D);
		TakesScreenshot Ts = (TakesScreenshot) D;
        WebElement Dc= D.findElement(By.xpath("//button[text()='Double Click Me']"));
        Act.doubleClick(Dc).build().perform();
        WebElement Rc= D.findElement(By.xpath("//button[text()='Right Click Me']"));
        Act.contextClick(Rc).build().perform();
        WebElement Clk= D.findElement(By.xpath("//button[text()='Click Me']"));
        Act.click(Clk).build().perform();
        Thread.sleep(3000);
        File Src1 = Ts.getScreenshotAs(OutputType.FILE);
		File Des1 = new File("C:\\Users\\venka\\eclipse-workspace\\Selenium\\Snapshot\\Act1.png");
		FileUtils.copyFile(Src1, Des1);
      //D.findElement(By.xpath("(//div[@class='element-list collapse'])[5]")).click();
       // WebElement Int= D.findElement(By.linkText("Interactions"));
     //   Act.moveToElement(Int).click().build().perform();
     // D.findElement(By.xpath("//span[text()='Dragabble']")).click();
     //   Act.moveToElement(Drg).click().build().perform();
      JavascriptExecutor Js = (JavascriptExecutor) D;
      WebElement scroll = D.findElement(By.xpath("//span[text()='Droppable']"));
		Js.executeScript("arguments[0].click();", scroll);
		File Src = Ts.getScreenshotAs(OutputType.FILE);
		File Des = new File("C:\\Users\\venka\\eclipse-workspace\\Selenium\\Snapshot\\Act.png");
		FileUtils.copyFile(Src, Des);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
