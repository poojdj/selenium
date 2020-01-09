package webElements;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingmultiplewindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\pooja1\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	     driver.get("https://www.jobserve.com/in/en/Job-Search/");
	     driver.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_DOWN);
	     Thread.sleep(2000);
	     driver.findElement(By.id("SPBApplyBtn")).click();
	     Thread.sleep(2000);
	     Set<String> winIds=driver.getWindowHandles();
	     Iterator<String> itr=winIds.iterator();
	     String win1=itr.next();
	     String win2=itr.next();
	     driver.switchTo().window(win2);
	     Thread.sleep(2000);
	     System.out.println(driver.getTitle());
	     driver.findElement(By.id("filCV")).sendKeys("G:\\Pooja\\Unix.txt");
        Thread.sleep(2000);
        driver.switchTo().window(win1);
        System.out.println(driver.getTitle());
        driver.quit();

	}

}
