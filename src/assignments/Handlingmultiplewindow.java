package assignments;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingmultiplewindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\pooja1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.online.citibank.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'nav\']/ul[3]/li/a/span[2]")).click();
		Set<String> winIds=driver.getWindowHandles();
		Iterator<String> itr=winIds.iterator();
		String win1=itr.next();
		String win2=itr.next();
		driver.switchTo().window(win2);
		System.out.println(driver.getTitle());
		driver.switchTo().window(win1);
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
