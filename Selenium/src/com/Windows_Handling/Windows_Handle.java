package com.Windows_Handling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Handle {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\venka\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver D= new ChromeDriver();
		Actions Act = new Actions(D);
		Robot R = new Robot();
		D.manage().window().maximize();
		D.get("https://www.gamestheshop.com/");
		WebElement Xbox = D.findElement(By.id("liXboxO"));
		Act.contextClick(Xbox).build().perform();
		R.keyPress(KeyEvent.VK_DOWN);
		R.keyRelease(KeyEvent.VK_DOWN);
		R.keyPress(KeyEvent.VK_ENTER);
		R.keyRelease(KeyEvent.VK_ENTER);
		WebElement nin = D.findElement(By.id("liXbox360"));
		Act.contextClick(nin).build().perform();
		R.keyPress(KeyEvent.VK_DOWN);
		R.keyRelease(KeyEvent.VK_DOWN);
		R.keyPress(KeyEvent.VK_ENTER);
		R.keyRelease(KeyEvent.VK_ENTER);
		WebElement ps5 = D.findElement(By.id("liPSP"));
		Act.contextClick(ps5).build().perform();
		R.keyPress(KeyEvent.VK_DOWN);
		R.keyRelease(KeyEvent.VK_DOWN);
		R.keyPress(KeyEvent.VK_ENTER);
		R.keyRelease(KeyEvent.VK_ENTER);
		
		String Parent = D.getWindowHandle();
		System.out.println(Parent);
		String pid = D.getCurrentUrl();
		System.out.println("parent" +pid);
		
		
		Set<String> Child = D.getWindowHandles();
		//System.out.println(Child);
		
		for (String single : Child) {
			
			
			String currentUrl = D.switchTo().window(single).getCurrentUrl();
			System.out.println(currentUrl);
			
			if (pid != currentUrl)
			{
				
				D.switchTo().window(single);
				Thread.sleep(3000);
				D.close();
			
		}
			break;
			
		}
		
		 
		
		
 
	
		
		
		
		
	}
		
		

	}


