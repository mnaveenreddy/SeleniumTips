package com.headlesschrome.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Quidco {

	public WebDriver driver;
	public String Firstname="Test1";
	public String Surname="Test2";
	public String email="Test4567@quidco.com";
	public String password="Testing12";
	
    @Test
	public void Join_With_Valid_details() throws InterruptedException
	{
		     driver=new FirefoxDriver();
		     driver.manage().window().maximize();
		     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		     driver.get("https://www.quidco.com/");
		     driver.findElement(By.linkText("Join for free")).click();
		     driver.findElement(By.id("first_name_join")).sendKeys(Firstname);
		     driver.findElement(By.id("last_name_join")).sendKeys(Surname);
		     driver.findElement(By.id("new_email_join")).sendKeys(email);
		     driver.findElement(By.id("new_password_join")).sendKeys(password);
		     Thread.sleep(3000);
		     JavascriptExecutor jse = (JavascriptExecutor)driver;
             jse.executeScript("scroll(0, 350)");
		    WebElement Tc=driver.findElement(By.xpath("//input[@name='agree_to_terms']"));
		    jse.executeScript("arguments[0].click();",Tc);
		     driver.findElement(By.id("join-quidco-submit-button")).click();
		     Thread.sleep(3000);
		     String ActualUser=driver.findElement(By.xpath("html/body/div[3]/div[2]/div/div[2]/div/div/div/div[1]/h1")).getText();
		     System.out.println(ActualUser);
		     System.out.println(ActualUser.substring(19,ActualUser.length()));
		     if(Firstname.equals(ActualUser.substring(19,ActualUser.length())))
		     {
		    	 System.out.println("The user has joined");
		     }else
		     {
		    	 System.err.println("The user has not joined");
		     }
		     
		     
	}
}
