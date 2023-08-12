package com.timeout;

import org.seleniumhq.jetty9.util.security.Password;
import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

import com.Adactin_Hotel.login;

public class Timeout {
	
	
	@Test(timeOut = 5000,expectedExceptions = ThreadTimeoutException.class)
	
	private void loGin() throws InterruptedException {
		Thread.sleep(7000);
                 System.out.println("Enter Login Details");
                 
                	}
	@Test(timeOut = 4000,expectedExceptions = ThreadTimeoutException.class)
    private void userName() throws InterruptedException {
		Thread.sleep(4000);
		System.out.println("Enter user name");

	} 
	
	@Test(timeOut  =3000)
	private void Password() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Enter Password Details");
		

	}
}
