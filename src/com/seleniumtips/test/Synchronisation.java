package com.seleniumtips.test;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronisation {

	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/chromedriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://spicejet.com");
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//explict wait
		WebDriverWait wait=new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("")));
		//Fluent Wait
wait.withTimeout(30, TimeUnit.SECONDS).pollingEvery(5,TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		
		
		

}
}