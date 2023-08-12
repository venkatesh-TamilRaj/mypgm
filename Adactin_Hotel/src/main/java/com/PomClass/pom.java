package com.PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.PojoClass.loginpage;

public class pom {
	
	public static WebDriver Driver;//null
	
	loginpage lp ;
	
	public pom(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.Driver=driver2;
		PageFactory.initElements(Driver, this);

		
	}
	public loginpage getLp() {
		lp = new loginpage(Driver);
		return lp;
	}

}
