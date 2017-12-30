package com.seleniumtips.test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windows {
 public static String x;
	public static void main(String[] args) {
		
		
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.google.com/gmail/about/");
    System.out.println(driver.getTitle());
	String fwindow=driver.getWindowHandle();
	driver.findElement(By.xpath("html/body/main/section/section[7]/div/span/a")).click();
	
	
	Set<String>s =driver.getWindowHandles();
	Iterator<String>i=s.iterator();
	/*or
	String parent=i.next();
	String child=i.next();*/
	
	while(i.hasNext())
	{
		x=i.next();
	}
	driver.switchTo().window(x);
	 System.out.println(driver.getTitle());
	driver.findElement(By.xpath("//*[@id='yDmH0d']/div[2]/c-wiz/div/div[2]/section/div/div[1]/div[1]/div[2]/div/content/span")).click();
	
	driver.switchTo().window(fwindow);
	 System.out.println(driver.getTitle());
	driver.findElement(By.xpath("html/body/nav/div/a[2]")).click();
}

}