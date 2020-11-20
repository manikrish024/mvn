package org.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Testng {

	@BeforeClass
	private void beforeclass() {
		System.out.println("before class");

	}

	@AfterClass
	private void afterclass() {
		System.out.println("after class");

	}
	
	@BeforeMethod
	private void beforemethod() {
		System.out.println("before method"); 
		
	}
	@AfterMethod
	private void aftermethod() {
		System.out.println("aftermethod");
		
		
	}

	@Test
private void maintest() {
		System.out.println("test");
	}
	
	
	
	
}
