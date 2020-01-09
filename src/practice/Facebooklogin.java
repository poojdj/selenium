package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\pooja1\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.get("https://m.facebook.com/login/?locale2=en_GB");
		driver.findElement(By.name("email")).sendKeys("pooju2015@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("sairampoo");
		driver.findElement(By.name("login")).click();


		
	}

}