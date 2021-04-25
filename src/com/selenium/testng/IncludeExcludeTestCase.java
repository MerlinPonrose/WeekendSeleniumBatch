package com.selenium.testng;

import org.testng.annotations.Test;

public class IncludeExcludeTestCase {
	
	
	
	@Test(enabled=true)
	public void car()
	{
		System.out.println("car");
	}
	
	@Test(enabled=false)
	public void bike()
	{
		System.out.println("bike");
	}
	@Test
	public void cycle()
	{
		System.out.println("cycle");
	}

}
