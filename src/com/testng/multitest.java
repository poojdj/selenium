package com.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class multitest {
	WebDriver driver;
  @Test(priority='1')
  public void visitbusiness()
  {
	  driver.findElement(By.linkText("Business")).click();
  }
  @Test(priority='3')
   public void visitAdvertising() 
  {
  	   driver.findElement(By.linkText("Advertising")).click();
    }
    @Test(priority='2')
     public void visitPrivacy() 
    {
  	  driver.findElement(By.linkText("Privacy")).click();
    }
    @Test(priority='4')
   public void visitTerms()
    {
  	 driver.findElement(By.linkText("Terms")).click();
}
    @Test(priority='5')
   public void visitAbout()
    {
  	 driver.findElement(By.linkText("About")).click();
   }
   @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  Thread.sleep(2000);
  }

  @AfterMethod
  public void afterMethod() {
	  driver.navigate().back();
  }

  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\pooja1\\chromedriver.exe");
	    
	  driver = new ChromeDriver();
			
	driver.get("https://www.google.com/");
	 
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
