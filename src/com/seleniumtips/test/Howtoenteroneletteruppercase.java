package com.seleniumtips.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Howtoenteroneletteruppercase {

		    public static void main(String[] args) {
		        System.setProperty("webdriver.gecko.driver",
		                "C://Users//xxxxx\\Downloads\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		        WebDriver driver = new FirefoxDriver();
		        driver.get("http://www.facebook.com");
		        String s="hELLo";
		        String str =s.substring(0, 1).toUpperCase()+s.substring(1).toLowerCase();
		        driver.findElement(By.name("email")).sendKeys(str);
		    }
		
		

	}


