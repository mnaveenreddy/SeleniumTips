package com.seleniumtips.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicTable {
public static String x;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("http://www.espncricinfo.com/indian-premier-league-2016/engine/match/980901.html");
			WebElement tab=driver.findElement(By.xpath("//*[@id='gp-inning-00']/div[2]/table"));
			List<WebElement> row=tab.findElements(By.tagName("tr"));
			/*for(int i=0;i<row.size();i++)
			{
				List<WebElement> cell=row.get(i).findElements(By.tagName("td"));
				for(int j=0;j<cell.size();j++)
				{
					 x=cell.get(j).getText();
					 System.out.println(x);
				}
			}*/
			/* int i=0;
		        
			 for(WebElement eachrow:row)
			 {
				   List<WebElement> eachcolumn=eachrow.findElements(By.tagName("td"));
				   i++;
				   for(WebElement text:eachcolumn)
				   {
					   System.out.println(text.getText());
				   }
			 }*/
			for(int i=0;i<row.size();i++)
			{
				List<WebElement> cell=row.get(i).findElements(By.tagName("td"));
				
				for(int j=0;j<cell.size();j++)
				{
					x=cell.get(i).getText();
				}
			}
		
	}

}
