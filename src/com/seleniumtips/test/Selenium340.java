package com.seleniumtips.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium340 {
 public static WebDriver driver;
	public static void main(String[] args) {
		
		// seenium 3.4.0 and FF 48+ and Geckodriver 0.16.0
		/*System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/src/geckodriver.exe");
		DesiredCapabilities caps = new FirefoxOptions()
			     // For example purposes only
			    .setProfile(new FirefoxProfile())
			    .addTo(DesiredCapabilities.firefox());
			 driver = new FirefoxDriver(caps);
		 //driver=new FirefoxDriver();
		  
*/		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.close();
	}
	
}
