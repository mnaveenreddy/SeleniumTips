package com.headlesschrome.test;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;



public class ZopaTest {

	public WebDriver driver;
	
    @Test
	  public void currentlyPlayed_recentlyPlayed() throws AWTException, InterruptedException
	  {
	 // System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/chromedriver.exe");
     
     driver=new FirefoxDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
     //Open The Zopa Website
     driver.get("https://www.zopa.com/");
     //Click on the Get A Zopa Loan. Customized Xpath locator
     driver.findElement(By.xpath("//a[@class='button button--fullWidth' and @href='/loans']")).click();
      
      Thread.sleep(10000);
      JavascriptExecutor jse = (JavascriptExecutor)driver;

      jse.executeScript("scroll(0, 350)");
      
      driver.findElement(By.id("submit-loan-button")).click();
      
    //Entering the member email id
      driver.findElement(By.id("member_email")).sendKeys("test12345@zopa.com");
      //Enter the First Name
      driver.findElement(By.id("applications_loan_apply_first_name")).sendKeys("Test");
      //Enter the Lastname
      driver.findElement(By.id("applications_loan_apply_last_name")).sendKeys("Testing");
      //Enter the Phone number
      driver.findElement(By.id("applications_loan_apply_home_phone")).sendKeys("07809112233");
      //Enter Date day
      driver.findElement(By.id("date_of_birth_day")).sendKeys("15");
      //Enter month
      driver.findElement(By.id("date_of_birth_month")).sendKeys("01");
      //Enter Year
      driver.findElement(By.id("date_of_birth_year")).sendKeys("1985");
      //Clicking on Home Improvements
      driver.findElement(By.xpath("//*[@id='content']/div/div/div/form/fieldset[1]/div[5]/p[1]/span[3]/label")).click();
    //Enter the Post code
      driver.findElement(By.id("address_postcode")).sendKeys("SE1 2QG");
      //Click on Look Up Address
      driver.findElement(By.xpath("//*[@id='address-lookup']/p[2]/input")).click();
      
      Thread.sleep(5000);
      //Getting the adress
      String Adress=driver.findElement(By.id("address_possible_address")).getText();
      System.out.println(Adress);
      //Sending Month From DropDown
      WebElement month=driver.findElement(By.id("address_from_2i"));
      Select dropdwon=new Select(month);
      dropdwon.selectByVisibleText("March");
      //Sending Year from DropDown
      WebElement year=driver.findElement(By.id("address_from_1i"));
      Select dropdown1=new Select(year);
      dropdown1.selectByValue("2017");
       
      //Clicking on use this adress
      driver.findElement(By.name("select_address")).click();
      //clicking on EMployed full time
      
      driver.findElement(By.xpath("//*[@id='content']/div/div/div/form/fieldset[3]/div[1]/p/span[2]/label")).click();
    //Entering annual salary
      
      driver.findElement(By.id("applications_loan_apply_salary")).sendKeys("40000");
      //Clicking on Outright owner
      driver.findElement(By.xpath(".//*[@id='content']/div/div/div/form/fieldset[3]/div[3]/p[1]/span[2]/label")).click();
      //Create a password
      driver.findElement(By.xpath("//*[@id='member_password']")).sendKeys("Testing123");
   
}
}