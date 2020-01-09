package webElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingtabledemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\pooja1\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://money.rediff.com/gainers");
        List< WebElement> cb=driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[5]/table[1]/thead[1]/tr[1]/th"));
         for(WebElement w:cb)
         {
       	  System.out.print(w.getText()+" ");
 			
         }
         System.out.println();
         List< WebElement> l=driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[5]/table[1]/tbody[1]/tr"));
         System.out.println("Size: "+l.size());
         driver.close();

	}

}
