package testcaseassignment;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Testcase2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\pooja1\\geckodriver.exe");
	    WebDriver driver =new FirefoxDriver();
		driver.get("https://in.ebay.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement myebay=driver.findElement(By.xpath("//*[@id='gh-eb-My']/div/a[1]"));
		Actions action=new Actions(driver);
		action.moveToElement(myebay).perform();
		Thread.sleep(4000);
		 List<WebElement> options=driver.findElements(By.xpath("/html[1]/body[1]/header[1]/div[1]/ul[2]/li[2]/div[1]/div[1]/ul[1]/li/a[1]"));
	        for(WebElement w:options)
	       	 System.out.println(w.getText());
		driver.close();
		
		//Random r=new Random();
        //int x=r.nextInt(options.size());
      // options.get(x).click();
       //driver.manage().timeouts().pageLoadTimeout(3,TimeUnit.SECONDS);
     // System.out.println(driver.getTitle());//
		
	}

}
