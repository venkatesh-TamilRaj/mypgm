package com.DataProvider;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.virtualauthenticator.Credential;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class Data_provider {

	@DataProvider(name ="login")
	private Object[][] CredentialData() {
		
		Object[][] data={
				
				{"venkat","venkat123"},
				{"venkatesh","venkat@123"}
		};
		
		return data;
	}
	
@Test(dataProvider = "login")
	private void loginScenario( String username,String password) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\venka\\eclipse-workspace\\Mini_project\\Driver\\chromedriver.exe");
		WebDriver D = new ChromeDriver();
		D.manage().window().maximize();
		D.get("http://automationpractice.com/index.php");
		D.findElement(By.linkText("Sign in")).click();
		WebElement uname = D.findElement(By.id("email"));
		uname.sendKeys(username);
		WebElement pass = D.findElement(By.id("passwd"));
		pass.sendKeys(password);
		D.findElement(By.id("SubmitLogin")).click();
		
		D.close();
		// TODO Auto-generated method stub

	}

}
