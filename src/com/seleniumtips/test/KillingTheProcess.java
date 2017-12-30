package com.seleniumtips.test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.servlet.http.Cookie;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.os.WindowsUtils;

public class KillingTheProcess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://google.co.uk");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       // WindowsUtils.tryToKillByName("notepad.exe");
        Set<org.openqa.selenium.Cookie> cookie=driver.manage().getCookies();
        System.out.println(cookie.size());
        Iterator<org.openqa.selenium.Cookie>i=cookie.iterator();
        while(i.hasNext())
        {
        	System.out.println(i.next());
        }
        
}
}