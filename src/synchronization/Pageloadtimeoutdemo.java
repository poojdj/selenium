package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pageloadtimeoutdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\pooja1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://istqb.in/");
		driver.findElement(By.xpath("//*[@id='tmMainMenu']/nav/div/div[3]/ul/li[3]/div/div/div[1]/ul/li[2]/a")).click();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());

	}

}
