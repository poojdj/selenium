package webElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplecheckboxdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\pooja1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://echoecho.com/htmlforms09.htm");
		List<WebElement> c = driver.findElements(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input"));
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

	}

}
