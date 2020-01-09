package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handlingdynamicmenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\pooja1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.americangolf.co.uk/club-page");
        WebElement golfClub=driver.findElement(By.xpath("//*[@id='header-navigation']/div[1]/ul/li[3]/a"));
        Actions act= new Actions(driver);
        act.moveToElement(golfClub).perform();
        List<WebElement> options=driver.findElements(By.xpath("//*[@id='CLUBS_1']/ul/li/ul/li/a/span"));
		for(WebElement w:options)
			System.out.println(w.getText());

	}

}
