package org.stepdefinition;

import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class prioritytestNG extends baseclassprjct { 
	
	@Test(priority = -15)
	private void tc2() {
		System.out.println("Inmakes");
		Launchurl("https://inmakesedu.com/");
		
	}
	
	@Test(priority = -20)
	private void tc3() {
		System.out.println("Gmail");
		Launchurl("https://mail.google.com/mail/u/0/#inbox");
		
	}
	 
	@Test(priority = -8)
	private void tc1() {
		System.out.println("RedBus");
		Launchurl("https://www.redbus.in/");
		
	}
	@Test(priority = 10)
	private void tc4() {
		System.out.println("Flipkart");
		Launchurl("https://www.flipkart.com/");
		
	}
	@Test(priority = 5)
	private void tc6() {
		System.out.println("Amazon");
		Launchurl("https://www.amazon.in/");
		
	}
	@Test(priority = 4)
	private void tc7() {
		System.out.println("YouTube");
		Launchurl("https://www.youtube.com/");
		
	}
	@Test(priority = 2)
	private void tc5() {
		System.out.println("facebook");
		Launchurl("https://www.facebook.com/");
		
	}
	
	@BeforeMethod
	private void Startdate() {
		Date d=new Date();
		System.out.println(d);

	}
	@AfterMethod
	private void Enddate() {
		Date d=new Date();
		System.out.println(d);
	}
	
	@BeforeClass
	private void launchthebrowser() {
		LaunchTheBrowser();
		Windowmaximize();
		}
	
	@AfterClass
	private void closethebrowser() {
		System.out.println("End Browser");
	}
	
}
