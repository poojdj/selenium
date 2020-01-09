package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\pooja1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		List<WebElement> cb=driver.findElements(By.xpath("//input[@name='group1']"));
		for(WebElement w:cb) {
        if(w.isEnabled())
        	{
        	  System.out.println("Default Status of radio button "+w.getAttribute("value")+" is "+w.isSelected());
              w.click();
              System.out.println("After click Status of radio button "+w.getAttribute("value")+" is "+w.isSelected());
        	}	
		}


	}

}
