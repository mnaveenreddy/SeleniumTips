package com.testng.test2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Tests {
	
	@Test
	public void firsttest()
	{
		System.out.println("firsttest");
	}
	
	@Test(dependsOnMethods={"firsttest"},alwaysRun=true)
	public void secondtest()
	{
		System.out.println("SecondTest");
	}
	@Test(enabled=false)
	public void enabling()
	{
		System.out.println("enabling");
	}
	@Test(timeOut=5000)
	public void timrelated()
	{
		System.out.println("enabling");
	}
	

}
