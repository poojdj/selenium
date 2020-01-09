package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  System.setProperty("webdriver.gecko.driver", "D:\\pooja1\\geckodriver.exe");
	    
	  WebDriver driver =new FirefoxDriver();
	  		
	  driver.get("https://www.google.com/");
	  	  
	    
  }
}
