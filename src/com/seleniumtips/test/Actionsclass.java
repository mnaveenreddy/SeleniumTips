package com.seleniumtips.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://amazon.co.uk");
		Actions act=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']/span[2]"));
		act.moveToElement(ele).build().perform();
		
		//New Action
		WebElement ele1=driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
		act.moveToElement(ele1).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		
		
		

	}

}
