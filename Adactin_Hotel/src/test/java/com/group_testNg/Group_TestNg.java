package com.group_testNg;

import org.testng.annotations.Test;

public class Group_TestNg {
	
	@Test(groups="Animal")
	private void CAt() {
		System.out.println("Cat");
	}
	@Test(groups="Animal")
	private void dOg() {
		// TODO Auto-generated method stub
		
		System.out.println("Dogs");
	}
	
	@Test(groups="Birds")
	private void PeaCock() {
		// TODO Auto-generated method stub
        System.out.println("Peacock");
	}
	@Test(groups="Birds")
	private void duck() {
		System.out.println("Duck");
		
}
	@Test(groups="sports")
	private void Bat() {
		// TODO Auto-generated method stub
		
		System.out.println("Bat");
		
	}
    @Test(groups="sports")	
	private void Ball() {
		// TODO Auto-generated method stub
  System.out.println("Ball");
	}
	
	
	
	

}
