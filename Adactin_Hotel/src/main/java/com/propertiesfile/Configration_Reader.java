package com.propertiesfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.NewSessionPipeline;

public class Configration_Reader {
	Properties p = new Properties();
	public Configration_Reader() throws IOException {
		// TODO Auto-generated constructor stub
	
    
	File f = new File(
			"C:\\Users\\venka\\eclipse-workspace\\Adactin_Hotel\\src\\main\\java\\com\\propertiesfile\\configration.properties");
	
	FileInputStream Fis = new FileInputStream(f);
	p.load(Fis);
	
	
	}
	
	public String geturl() {
		// TODO Auto-generated method stub
         String url = p.getProperty("url");
		return url;
	}
	
	public String getusername() {
		// TODO Auto-generated method stub
              String username = p.getProperty("username");
			return username;
	}
	
	public String getpassword() {
		// TODO Auto-generated method stub
		
		String password = p.getProperty("password");
		return password;

	}

}
