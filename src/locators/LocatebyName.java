package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatebyName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\pooja1\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement w=driver.findElement(By.name("q"));
		w.sendKeys("Testing");
	     //driver.findElement(by.name("q")).sendKeys("testing");-----Findelement will return the web element. sendkeys is method of web element;

	}

}
