package com.seleniumtips.test;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/droppable/");
	    System.out.println(driver.findElements(By.tagName("iframe")).size());
	   // driver.switchTo().frame(0);  .tagname(frameset)
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		WebElement source=driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement target=driver.findElement(By.xpath("//*[@id='droppable']"));
		    Actions act=new Actions(driver);
		    act.dragAndDrop(source, target).build().perform();
		    
		    driver.switchTo().defaultContent();
		
		
		

	}

}
