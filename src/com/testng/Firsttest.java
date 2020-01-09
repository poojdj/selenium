package com.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Firsttest {
	WebDriver driver;
	 
  @Test
  public void f() {
	  System.out.println(driver.getTitle());
  }
   @BeforeMethod
   public void beforeMethod() {
 	  System.setProperty("webdriver.chrome.driver","D:\\pooja1\\chromedriver.exe");
       
 	  driver = new ChromeDriver();
 	  		
 	  driver.get("https://www.google.com/");
 	   
   }

   @AfterMethod
   public void afterMethod() {
 	  driver.close();
   }

 }
