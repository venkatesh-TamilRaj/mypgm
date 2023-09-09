package com.Alert;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Alert {

	public static void main(String[] args) throws InterruptedException, IOException   {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\venkat\\eclipse-workspace\\Selenium\\Driver\\operadriver.exe");
		WebDriver D =new ChromeDriver();
		D.manage().window().maximize();
		D.get("https://demoqa.com/alerts");
		 D.findElement(By.id("alertButton")).click();
		 D.switchTo().alert().dismiss();
		 Thread.sleep(2000);
		// D.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		// Thread.sleep(6000);
		// D.switchTo().alert().accept();
		// D.findElement(By.xpath("//button[@id='timerAlertButton'")).click();
		// D.switchTo().alert().accept();
		 D.findElement(By.id("confirmButton")).click();
		 D.switchTo().alert().accept();
		 WebElement prompt = D.findElement(By.id("promtButton"));
		 prompt.click();
		 D.switchTo().alert().sendKeys("welcome");
		 D.switchTo().alert().accept();
		 TakesScreenshot Ts = (TakesScreenshot)D;
		 File src= Ts.getScreenshotAs(OutputType.FILE);
		 File Dec = new File("C:\\Users\\venka\\eclipse-workspace\\Selenium\\Snapshot\\Alert.png");
		 FileUtils.copyFile(src, Dec);
		 System.out.println(prompt.getText());
		 D.quit();
			
		

	}

}
