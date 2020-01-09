package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingcheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\pooja1\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
WebElement cb=driver.findElement(By.id("remember"));
if(cb.isDisplayed())
	if(cb.isEnabled())
		if(cb.isSelected())
			cb.click();
			
	}

}
