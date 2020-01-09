package testcaseassignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Testcase7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\pooja1\\geckodriver.exe");
	    WebDriver driver =new FirefoxDriver();
		driver.get("https://in.ebay.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='gh-ac']")).sendKeys("camera");
		driver.findElement(By.id("gh-btn")).click();
		WebElement optn=driver.findElement(By.xpath("//*[@id='w10']/button/div"));
		Actions option=new Actions(driver);
		option.moveToElement(optn).perform();
		driver.findElement(By.xpath("//span[contains(text(),'Customize')]")).click();
		List<WebElement> li= driver.findElements(By.xpath("//*[@id='e1-1']/div/fieldset[3]/div/label[1]/input"));
		Thread.sleep(2000);
		for(WebElement w:li)
			if(w.isEnabled())
				w.click();
		driver.findElement(By.xpath("//input[@id='e1-3']")).click();
		Thread.sleep(2000);
		driver.close();
	}

	}


