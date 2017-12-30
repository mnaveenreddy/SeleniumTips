package com.seleniumtips.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class findinghiddenelements {

	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/chromedriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://spicejet.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Before click on Multi city");
		//isdisplayed
		int count=driver.findElements(By.xpath("")).size();
		if(count==0)
		{
			
		}
	}
}
