package testcaseassignment;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Testcase5 {
	private WebDriver driver;
	private Properties p;
	private File file;
	private FileInputStream fis;
	
  @Test
  public void f() {
	  driver.findElement(By.id(p.getProperty("gh-as-a"))).click();
	  driver.findElement(By.id(p.getProperty("_nkw"))).sendKeys(p.getProperty("watch"));
	  driver.findElement(By.id(p.getProperty("_ex_kw"))).sendKeys(p.getProperty("camera"));
	  driver.findElement(By.id(p.getProperty("e1-1"))).click();
	  System.setProperty("webdriver.chrome.driver", "D:\\pooja1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/sch/ebayadvsearch");
		List<WebElement> c = driver.findElements(By.xpath("/html[1]/body[1]/div[3]/div[4]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[3]/label[3]"));
     int i=1;
		for(WebElement w:c)
      {
      	if(w.isEnabled())
      	{
      		System.out.println("Default status of checkbox "+i+" with name "+w.getAttribute("value")+" is "+w.isSelected());
      		w.click();
      		System.out.println("After click status of checkbox "+i+" with name "+w.getAttribute("value")+" is "+w.isSelected());
      	}
      	i++;
      }
		 System.setProperty("webdriver.chrome.driver", "D:\\pooja1\\chromedriver.exe");
		 WebDriver driver2= new ChromeDriver();
		 driver.get("https://www.ebay.com/sch/ebayadvsearch");
		 WebElement cb=driver.findElement(By.id("_mPrRngCbx"));
		 if(cb.isDisplayed())
		 	if(cb.isEnabled())
		 		if(cb.isSelected())
		 			cb.click();
		 driver.findElement(By.name(p.getProperty("_udlo"))).sendKeys("1000");
		 driver.findElement(By.name(p.getProperty("_udhi"))).sendKeys("10000");
		 System.setProperty("webdriver.chrome.driver", "D:\\pooja1\\chromedriver.exe");
		 WebDriver driver3= new ChromeDriver();
		 driver.get("https://www.ebay.com/sch/ebayadvsearch");
		 WebElement b=driver.findElement(By.id("_mPrRngCbx"));
		 if(b.isDisplayed())
		 	if(b.isEnabled())
		 		if(b.isSelected())
		 			b.click();
		 }
	  
  
  @AfterMethod
  public void afterMethod() {
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @BeforeTest
  public void beforeTest() throws IOException {
	  file = new File("D:\\New folder\\Selenium\\src\\Ebay.properties");
	  fis = new FileInputStream(file);
	  p = new Properties();
	  p.load(fis);
	  System.setProperty("webdriver.chrome.driver", "D:\\pooja1\\chromedriver.exe");
      
	  driver = new ChromeDriver();
	 // driver.manage().window().maximize();
	  driver.get(p.getProperty("url"));
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  
	  
  }

}
