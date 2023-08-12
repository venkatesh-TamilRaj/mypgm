package com.Adactin_Hotel;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SubmitElement;
import org.openqa.selenium.support.ui.Select;
import com.BaseClass.Adactin_base;
import com.PojoClass.loginpage;
import com.PomClass.pom;
import com.propertiesfile.FileReadManager;

public class login extends Adactin_base{


public static void main(String[] args) throws IOException {
	
	getbrowser("chrome");
	Driver = new ChromeDriver();

	//geturl("https://adactinhotelapp.com/index.php");
	Wait(5);
	pom pom =new pom(Driver);
	geturl(FileReadManager.getInstancefr().getInstancecr().geturl());
	enter(pom.getLp().getUsername(),FileReadManager.getInstancefr().getInstancecr().getusername());
	enter(pom.getLp().getPassword(), FileReadManager.getInstancefr().getInstancecr().getpassword());
	//enter(pom.getLp().getUsername(),"venkat1992");
	//enter(pom.getLp().getPassword(), "****");
	click(pom.getLp().getLogin());
	Select("select by text", pom.getLp().getLocation(), "Sydney");
	Select("select by value",pom.getLp().getHotel(),"Hotel Sunshine");
	Select("select by value",pom.getLp().getRoom(),"Standard");
	Select("select by value",pom.getLp().getRno(),"5");
	Select("select by value",pom.getLp().getAdult(),"4");
	Select("select by value",pom.getLp().getChild(),"3");
	click(pom.getLp().getSubmit());
	click(pom.getLp().getRadio());
	click(pom.getLp().getContinueB());
	enter(pom.getLp().getFname(),"venkatesh");
	enter(pom.getLp().getLname(),"T");
	enter(pom.getLp().getAddress(),"122,washington Road,london");
	enter(pom.getLp().getCc_num(),"1234567891234567");
	Select("select by value",pom.getLp().getCctype(),"VISA");
	Select("select by value",pom.getLp().getExp(),"5");
	Select("select by text",pom.getLp().getYear(),"2022");
	enter(pom.getLp().getCvv(),"125");
	click(pom.getLp().getBooknow());
	click(pom.getLp().getItinerary());
	
	click(pom.getLp().getLogout());
	
	
	/*
   
 
    
    
    
   Driver.findElement(By.id("my_itinerary")).click();
   Driver.findElement(By.id("logout")).click();*/
    
		
		
		
	}



}
