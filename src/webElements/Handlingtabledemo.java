package webElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingtabledemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\pooja1\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://money.rediff.com/gainers");
	    List < WebElement> cNames=driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[5]/table[1]/tbody[1]/tr/td[1]/a[1]"));
	      String exp="Hubtown";
	      for(int i=0;i<cNames.size();i++)
	      {
	    	  if(cNames.get(i).getText().equalsIgnoreCase(exp))
	    	  {
	    		  System.out.println(exp+"found at"+(i+1)+"postion");
	    		  System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[5]/table[1]/tbody[1]/tr["+(i+1)+"]")).getText());
	    		  break;
	    	  }

	      }
	}
}

