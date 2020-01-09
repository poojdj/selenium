package assignments;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class NewTest2 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  
	  WebElement drop=driver.findElement(By.linkText("Droppable"));
	  Actions action=new Actions(driver);
	  action.contextClick(drop).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
	  .sendKeys(Keys.RETURN).build().perform();
	 Thread.sleep(2000);
	  WebElement frame=driver.findElement(By.className("demo-frame"));
	     driver.switchTo().frame(frame);
	     WebElement source=driver.findElement(By.id("draggable"));
	     WebElement target=driver.findElement(By.id("droppable"));
	    // Actions act=new Actions(driver);
	     //act.dragAndDrop(source, target).perform();
	     //for getting exact location 
   action.dragAndDropBy(source, target.getLocation().getX(),target.getLocation().getY()).perform();
   Thread.sleep(2000);
    driver.switchTo().defaultContent();
    
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\pooja1\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
     driver.get("https://jqueryui.com/");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();

  }

}
