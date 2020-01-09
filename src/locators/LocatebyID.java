package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatebyID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\pooja1\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");

	      driver.get("http://mail.rediff.com/cgi-bin/login.cgi");
	      driver.findElement(By.id("login1")).sendKeys("pooja");
	      driver.findElement(By.id("password")).sendKeys("poo");

	}

}
