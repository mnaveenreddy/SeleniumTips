package com.seleniumtips.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicDropDown {
	
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/chromedriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://spicejet.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT']")).click();
		//driver.findElement(By.xpath("//*[text()='Goa (GOI)'])").click();
		driver.findElement(By.xpath(".//*[@id='dropdownGroup1']/div/ul[1]/li[5]/a")).click();
		driver.switchTo().activeElement();
		driver.findElement(By.xpath("(//*[@id='dropdownGroup1']/div/ul[1]/li[3]/a)[2]")).click();
		//any aleart 
		//driver.switchTo().alert().accept();
		//driver.switchTo().alert().getText();

}
}
