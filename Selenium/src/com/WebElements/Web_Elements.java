package com.WebElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Web_Elements {

	public static void main(String[] args) throws InterruptedException {
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\venka\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");	
     WebDriver d = new ChromeDriver();
     d.manage().window().maximize();
     d.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26ext_vrnc%3Dhi%26tag%3Dgooghydrabk1-21%26ref%3Dnav_custrec_signin%26adgrpid%3D58490306106%26hvpone%3D%26hvptwo%3D%26hvadid%3D486391490878%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D6947506639254633298%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D1007809%26hvtargid%3Dkwd-298187295805%26hydadcr%3D5657_2175734%26gclid%3DEAIaIQobChMIy7WdkeDS9wIVzH0rCh0HSArlEAAYASAAEgLcx_D_BwE&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
     WebElement username = d.findElement(By.id("ap_email"));
     username.sendKeys("venkatesh.t@gmail.com");
     WebElement con = d.findElement(By.id("continue"));
     boolean displayed = con.isDisplayed();
     System.out.println(displayed);
     boolean enabled = con.isEnabled();
     System.out.println(enabled);
     boolean selected = con.isSelected();
     System.out.println(selected);
     String attribute = con.getAttribute("id");
     System.out.println(attribute);
     con.click();
     WebElement pass = d.findElement(By.id("ap_password"));
     pass.sendKeys("venkat123");
     WebElement signin = d.findElement(By.className("a-button-input"));
     signin.click();   
     Thread.sleep(3000);  
     d.close();
 
	}
	

}
