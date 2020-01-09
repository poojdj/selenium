package webElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handlingdropdowndemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\pooja1\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
	      WebElement cntry=driver.findElement(By.id("country"));
	      Select nation=new Select(cntry);
	      System.out.println("default selected option:"+nation.getFirstSelectedOption().getText());
	      List<WebElement> countries=nation.getOptions();
	      System.out.println("total countries:"+countries.size());
	      WebElement cty=driver.findElement(By.xpath("//*[@id='div_city']/table/tbody/tr[1]/td[3]/select"));
	      Select city=new Select(cty);
	      System.out.println("default selected option:"+city.getFirstSelectedOption().getText());
	      city.selectByVisibleText("Pune");
	      System.out.println("default selected option:"+city.getFirstSelectedOption().getText());
	      List<WebElement> cities=city.getOptions();
	      for(WebElement w:cities)
	    	  System.out.println(w.getText());
	      System.out.println("total citirs are "+cities.size());
	}



	}


