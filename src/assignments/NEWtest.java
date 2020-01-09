package assignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NEWtest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\pooja1\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	     driver.get("https://jqueryui.com/droppable/");
	     WebElement targetLink=driver.findElement(By.linkText("Droppable"));
	     targetLink.sendKeys(Keys.chord(Keys.SHIFT,Keys.ENTER));
	     Actions action=new Actions(driver);
	    // action.contextClick(targetLink). sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN) .sendKeys(Keys.ARROW_DOWN) .sendKeys(Keys.RETURN).build().perform();
	   
	    Set<String> winIds=driver.getWindowHandles();
	     Iterator<String> itr=winIds.iterator();
	     String win1=itr.next();
	     String win2=itr.next();
	     driver.switchTo().window(win2);

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
}
