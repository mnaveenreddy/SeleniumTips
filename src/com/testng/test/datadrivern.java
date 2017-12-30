package com.testng.test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class datadrivern {

	public WebDriver driver;
	
	@Test (dataProvider="getdata")
	public void login(String username,String password)
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login.yahoo.com/?src=ym&intl=uk&lang=en-GB");
		driver.findElement(By.xpath("//*[@id='login-username']")).sendKeys(username);
	}
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data=new Object[1][2];
		data[0][0]="naveen";
		data[0][1]="reddy";
		return data;
	}
}
