package com.testng.test2;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class basicannotations002 {

	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("beforesuite");
	}

	@AfterSuite
	public void aftersuite()
	{
		System.out.println("aftersuite");
	}
	
}
