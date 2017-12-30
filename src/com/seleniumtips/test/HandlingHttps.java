package com.seleniumtips.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class HandlingHttps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxProfile prof=new FirefoxProfile();
		prof.setAcceptUntrustedCertificates(true);
		WebDriver driver=new FirefoxDriver(prof);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
	}

}
