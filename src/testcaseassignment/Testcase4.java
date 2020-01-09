package testcaseassignment;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Testcase4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\pooja1\\geckodriver.exe");
	    WebDriver driver =new FirefoxDriver();
		driver.get("https://in.ebay.com/");
driver.findElement(By.xpath("html[1]/body[1]/header[1]/table[1]/tbody[1]/tr[1]/td[3]/form[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]")).click();
		Thread.sleep(2000);
		
		driver.close();

	}

}
