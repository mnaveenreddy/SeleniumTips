package com.headlesschrome.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeHeadless {
  public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/chromedriver.exe");
       ChromeOptions options=new ChromeOptions();
       options.addArguments("window-size=1400,800");
      // options.addArguments("headless");
       driver=new ChromeDriver(options);
     
       driver.get("http://automationtesting.in");
      // driver.manage().window().maximize();
       System.out.println(driver.getTitle());
       driver.findElement(By.cssSelector("#s")).sendKeys("testng");
       driver.findElement(By.cssSelector("#s")).sendKeys(Keys.ENTER);
       System.out.println(driver.getTitle());
       driver.close();
       
	}

}
