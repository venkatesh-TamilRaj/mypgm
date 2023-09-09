package com.shop;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.GetAllWindowHandles;

public class Shopping {
	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\venka\\eclipse-workspace\\Mini_project\\Driver\\chromedriver.exe");
		WebDriver D = new ChromeDriver();
		D.manage().window().maximize();
		D.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		D.get("http://automationpractice.com/index.php");
		D.findElement(By.linkText("Sign in")).click();
		D.findElement(By.id("email")).sendKeys("venkateshwaran@outlook.com");
		D.findElement(By.id("passwd")).sendKeys("venkat1234");
		D.findElement(By.id("SubmitLogin")).click();
		/*D.get("http://automationpractice.com/index.php");
		Actions Act = new Actions(D);
		WebElement cm = D.findElement(By.xpath("//a[@title='Faded Short Sleeve T-shirts']"));
		Act.contextClick(cm).build().perform();
		Robot R = new Robot();
		R.keyPress(KeyEvent.VK_DOWN);
		R.keyRelease(KeyEvent.VK_DOWN);
		R.keyPress(KeyEvent.VK_ENTER);
		R.keyRelease(KeyEvent.VK_ENTER);
		
		 * Set<String> allwin = D.getWindowHandles(); int size = allwin.size();
		 * System.out.println(size); List<String> list = new ArrayList<String>(allwin);
		 * D.switchTo().window(list.get(0)); String currentUrl = D.getCurrentUrl();
		 * System.out.println(currentUrl);
		 */

		D.get("http://automationpractice.com/index.php?id_product=1&controller=product");
		WebElement cart = D.findElement(By.name("Submit"));
		D.get("http://automationpractice.com/index.php?id_product=1&controller=product");
		//D.findElement(By.id("button_order_cart")).click();
		
	}

}
