package com.testng.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class parameterisation {
	
public WebDriver driver;
	
	@Test 
    @Parameters({"userid"})
	public void login(String username)
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login.yahoo.com/?src=ym&intl=uk&lang=en-GB");
		driver.findElement(By.xpath("//*[@id='login-username']")).sendKeys(username);
	}
}
