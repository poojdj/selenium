package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Redifflogin {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String un, String pwd) {
	  driver.findElement(By.id("login1")).sendKeys(un);
	  driver.findElement(By.id("password")).sendKeys(pwd);
	  driver.findElement(By.name("remember")).click();
 	  driver.findElement(By.name("proceed")).click();
 	  }
@BeforeMethod
public void beforeMethod() throws InterruptedException {
  Thread.sleep(2000);
}

@AfterMethod
public void afterMethod() {
 
  driver.findElement(By.id("login1")).clear(); 
}
@DataProvider
public Object[][] dp() 
{
  Object [][] data=new Object[3][2];
    data[0][0]="Pooja";
       data[0][1]="Pooja";
       data[1][0]="Prajakta";
       data[1][1]="Prajakta";
      data[2][0]="Dhanshree";
        data[2][1]="Dhanshree";
 	  return data;
   }
   @BeforeTest
public void beforeTest() {
  System.setProperty("webdriver.chrome.driver","D:\\pooja1\\chromedriver.exe");
  driver = new ChromeDriver();
  		 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
}

@AfterTest
public void afterTest() {
  driver.close();
}

}
