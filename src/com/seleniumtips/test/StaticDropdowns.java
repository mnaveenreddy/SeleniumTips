package com.seleniumtips.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StaticDropdowns {
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/chromedriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://spicejet.com");
		driver.manage().window().maximize();
		
		org.openqa.selenium.support.ui.Select sel=new org.openqa.selenium.support.ui.Select(driver.findElement(By.xpath(".//*[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_CHD']")));
         sel.selectByIndex(1);
         sel.selectByValue("3");
         sel.selectByVisibleText("5 Adults");
	}

}
