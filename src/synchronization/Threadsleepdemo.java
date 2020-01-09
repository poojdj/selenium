package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Threadsleepdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\pooja1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Testing");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[2]/div[2]/ul/li[5]/div/div[2]/div/span/b")).click();


	}

}
