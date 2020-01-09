package webElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttondemo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\pooja1\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("http://www.echoecho.com/htmlforms10.htm");
	      Thread.sleep(2000);
    
	      List<WebElement> cb=driver.findElements(By.xpath("//input[@name='group1']"));
	      for(WebElement w:cb)
	      {
	    	
	      
	      if(w.isEnabled())
	      {
	    	  System.out.println("default status of radio button " +w.getAttribute("value")+" is "+w.isSelected());
				w.click();
				System.out.println("after status of radio button" +w.getAttribute("value")+" is "+w.isSelected());
				
	      }
	      }

	}

}
