package com.selenium.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotation {
	
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("In before suite");
	}
	
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("In before test");
	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("In before class");
	}
	
@BeforeMethod
	public void beforemethod()
	{
		System.out.println("In before method");
	}
	
	@Test
	public void test()
	{
		System.out.println("In test");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("In after method");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("In after test");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("In after class");
	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("In after suite");
	}
	
}
