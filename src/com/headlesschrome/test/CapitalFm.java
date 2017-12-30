package com.headlesschrome.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CapitalFm {
	
	public WebDriver driver;
	
     @Test
	  public void currentlyPlayed_recentlyPlayed()
	  {
	  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/chromedriver.exe");
      
      driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      driver.get("http://www.capitalfm.com/london/");
      
      //Clicking on See more
       driver.findElement(By.xpath("//a[@class='see_more' and @href='/london/radio/last-played-songs/']")).click();
      
      //Getting the text of currently played
      String nowplaying=driver.findElement(By.xpath("//div[@class='now-playing__text-content']/p/span[2]")).getText();;
      
      //Scrolling down
     
      JavascriptExecutor jse = (JavascriptExecutor)driver;
      jse.executeScript("window.scrollBy(0,250)", "");
      
      //Getting the most recently played
     String recentlyplayed=driver.findElements(By.xpath("div[@class='song__text-content']/h3/span/a")).get(0).getText();
    
     
     if(nowplaying.equalsIgnoreCase("Justin Bieber"))
     {
    	 System.out.println("Justin Bieber is playing");
     }else if(recentlyplayed.equalsIgnoreCase("Justin Bieber"))
     {
    	 System.out.println("Justin Bieber is recently played");
     }else{
    	  System.out.println("Justin Bieber hasn't played");
     }
    	  
      
      
}
}