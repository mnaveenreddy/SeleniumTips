package com.testng.test2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class basicannotations001 {

	
	@Test
	public void firsttest()
	{
		System.out.println("firsttest");
	}
	
	@Test
	public void secondtest()
	{
		System.out.println("SecondTest");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("beforemetod");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("aftermetod");
	}
	@BeforeTest
	public void beforetest()
	{
		System.out.println("beforetest");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("aftertest");
	}
}
