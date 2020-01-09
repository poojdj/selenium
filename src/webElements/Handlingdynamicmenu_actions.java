package webElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handlingdynamicmenu_actions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\pooja1\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://www.istqb.in/");
        WebElement foundation=driver.findElement(By.xpath("//*[@id=\"tmMainMenu\"]/nav/div/div[3]/ul/li[3]/a"));
       		 Actions act=new Actions(driver);
        act.moveToElement(foundation).perform();
        List<WebElement> options=driver.findElements(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[1]/div[3]/ul[1]/li[3]/div[1]/div[1]/div[1]/ul[1]/li/a[1]"));
        for(WebElement w:options)
       	 System.out.println(w.getText());
       /* 
        Random r=new Random();
        int x=r.nextInt(options.size());
       options.get(x).click();
       driver.manage().timeouts().pageLoadTimeout(3,TimeUnit.SECONDS);
      System.out.println(driver.getTitle());*/
	}


	}


