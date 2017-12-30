package com.testng.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Tests extends basicannotations001 {
	
	@Test (groups={"smoketest"})
	public void firsttest()
	{
		System.out.println("firsttest depended method-smoke test and sanity");
	}
	
	@Test(dependsOnMethods={"firsttest"},alwaysRun=true)
	public void secondtest()
	{
		System.out.println("SecondTest depends on method");
	}
	@Test(enabled=true,groups={"smoketest"})
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
