package com.seleniumtips.test;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class links {

	public static String before;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://ebay.co.uk");
	System.out.println(driver.findElements(By.tagName("a")).size());
	
	// To find only footer links. First find the footer.
	WebElement footer=driver.findElement(By.xpath("//*[@id='glbfooter']"));
	System.out.println(footer.findElements(By.tagName("a")).size());
	
	//Getting only perticular section getthat xpath
	
	WebElement sellcolumn=driver.findElement(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
	System.out.println(sellcolumn.findElements(By.tagName("a")).size());
	java.util.List<WebElement> ele=sellcolumn.findElements(By.tagName("a"));
	for(int i=0;i<ele.size();i++)
	{
		if(ele.get(i).getText().contains("Seller Centre"))
		{
			before=driver.getTitle();
			ele.get(i).click();
			break;
		}
	}
	
	String after=driver.getTitle();
	
    if(before!=after)
    {
    	if(driver.getPageSource().contains("View our Sitemap"))
    		System.out.println("pass");
    } 
    else{
    	System.out.println("fail");
    }
	}

}
