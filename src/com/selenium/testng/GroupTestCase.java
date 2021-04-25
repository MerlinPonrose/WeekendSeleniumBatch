package com.selenium.testng;

import org.testng.annotations.Test;

public class GroupTestCase {
	

	@Test(groups= {"sanity"})
	public void car()
	{
		System.out.println("car");
	}
	
	@Test(groups= {"sanity"})
	public void bike()
	{
		System.out.println("bike");
	}
	@Test(groups= {"sanity"})
	public void cycle()
	{
		System.out.println("cycle");
	}
	
	@Test(groups = {"smoke"})
	public void apple()
	
	{
		System.out.println("Apple");
	}
	
	@Test(groups = {"smoke"})
	public void mango()
	{
		System.out.println("mango");
	}
	
	@Test(groups = {"smoke"})
	public void banana()
	{
		System.out.println("Banana");
	}
	
	@Test(groups = {"test"})
	public void testt()
	{
		System.out.println("test");
	}

}
