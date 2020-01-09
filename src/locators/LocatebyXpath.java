package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatebyXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\pooja1\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		//using abs
		driver.findElement(By.xpath("html/body/div/div[4]/form/div[2]/div/div/div/div[2]/input")).sendKeys("Hello");
       //using relative xpath
		// driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Hi..");
	}

}
