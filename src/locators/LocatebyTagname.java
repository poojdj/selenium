package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatebyTagname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\pooja1\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		   for(WebElement w:links)
			   System.out.println(w.getText());
			}

	}


