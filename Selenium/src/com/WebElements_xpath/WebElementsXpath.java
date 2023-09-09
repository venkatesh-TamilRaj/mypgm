package com.WebElements_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.WebDriver.Web_Driver;

public class WebElementsXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\venka\\eclipse-workspace\\Selenium\\Driver\\msedgedriver.exe");
		WebDriver D =new EdgeDriver();
		D.manage().window().maximize();
		D.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		D.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("venkat@gmail.com");
		D.findElement(By.id("continue")).click();
		D.findElement(By.xpath("//a[contains(text(),'hange')]")).click();
		D.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("venkatesh.t@gmail.com");
		D.findElement(By.id("continue")).click();
		//D.findElement(By.xpath("//a[contains(text(),'Password')]")).click();
		D.findElement(By.xpath("//input[contains(@id,'ap_password')]")).sendKeys("venkat@gmail.com");
		D.findElement(By.id("signInSubmit")).click();
		D.findElement(By.xpath("//a[contains(text(),'Password')]")).click();
	}

}
 