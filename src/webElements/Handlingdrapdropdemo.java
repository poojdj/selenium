package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handlingdrapdropdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\pooja1\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	     driver.get("https://jqueryui.com/droppable/");
	     WebElement frame=driver.findElement(By.className("demo-frame"));
	     driver.switchTo().frame(frame);
	     WebElement source=driver.findElement(By.id("draggable"));
	     WebElement target=driver.findElement(By.id("droppable"));
	     Actions act=new Actions(driver);
	     //act.dragAndDrop(source, target).perform();
	     //for getting exact location 
      act.dragAndDropBy(source, target.getLocation().getX(),target.getLocation().getY()).perform();
       driver.switchTo().defaultContent();
       driver.close();
	}

	}


