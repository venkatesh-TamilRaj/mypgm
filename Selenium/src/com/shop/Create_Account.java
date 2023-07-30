package com.shop;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Create_Account {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\venka\\eclipse-workspace\\Mini_project\\Driver\\chromedriver.exe");
		WebDriver D =new ChromeDriver();
		D.manage().window().maximize();
		D.get("http://automationpractice.com/index.php");
		D.findElement(By.linkText("Sign in")).click();
		//D.get("http://automationpractice.com/index.php?controller=my-account");
		D.findElement(By.id("email_create")).sendKeys("venkateshwaran@outlook.com");
		D.findElement(By.name("SubmitCreate")).click();
		Thread.sleep(10000);
		D.findElement(By.id("id_gender1")).click();
		D.findElement(By.id("customer_firstname")).sendKeys("venkatesh");
		D.findElement(By.id("customer_lastname")).sendKeys("T");
		D.findElement(By.id("passwd")).sendKeys("venkat1234");
		D.findElement(By.id("newsletter")).click();
		D.findElement(By.id("optin")).click();
		D.findElement(By.id("company")).sendKeys("Software Company");
		D.findElement(By.id("address1")).sendKeys("D,Block ");
		D.findElement(By.id("address2")).sendKeys("Texas");
		D.findElement(By.id("city")).sendKeys("United States");
		D.findElement(By.id("postcode")).sendKeys("60012");
		D.findElement(By.id("other")).sendKeys("Nil");
		D.findElement(By.id("phone")).sendKeys("9568865445");
		D.findElement(By.id("phone_mobile")).sendKeys("9564865445");
		D.findElement(By.id("alias")).sendKeys("Raj");
		WebElement Days = D.findElement(By.id("days"));
		Select Day = new Select(Days);
		Day.selectByIndex(1);
		WebElement Month = D.findElement(By.id("months"));
		Select Months = new Select(Month);
		Months.selectByIndex(10);
		WebElement years = D.findElement(By.id("years"));
		Select year = new Select(years);
		year.selectByVisibleText("1995  ");
		WebElement Country = D.findElement(By.id("id_country"));
		Select C = new Select(Country);
		C.selectByVisibleText("United States");
		WebElement States = D.findElement(By.id("id_state"));
		Select S = new Select(States);
		S.selectByVisibleText("Texas");
		Thread.sleep(3000);
		D.findElement(By.id("submitAccount")).click();	
		
	
	}

}
