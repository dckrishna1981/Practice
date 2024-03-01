package com.tests;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestCases {

	@BeforeMethod
	public void loginApplication()
	{
		System.out.println("Logged in the application");
	}
	
	@Test 
	public void TestCase1()
	{
		
			//String myPropertyValue = System.getProperty("username");
	        //System.out.println("Value of username: " + myPropertyValue);
	        
	        /*String sEnvironment = System.getProperty("env");
	        System.out.println("Value of username: " + sEnvironment);
		
	        switch(sEnvironment)
	        {
	        	case("INT"):System.out.println("The execution is to be done at INT");
	        					break;
	        	case("UAT"):System.out.println("The execution is to be done at UAT");
						break;
	        	default:System.out.println("The execution is to be done at other Env");
	        	 
	        }*/
	        WebDriverManager.chromedriver().setup();
            
            // Create an instance of WebDriver (in this case, ChromeDriver)
            WebDriver driver = new ChromeDriver();
            
            // Use WebDriver instance to interact with the browser
            driver.get("https://example.com");
		System.out.println("The verification of test case 1 is done");
	}
	
	@Test
	public void TestCase2()
	{
		System.out.println("The verification of test case 2 is done");
	}
	
	@Test
	public void TestCase3()
	{
		System.out.println("Running the Testcase3");
	}
	
	@AfterMethod
	public void logoutApplication()
	{
		System.out.println("Logged out the application");
	}
}
