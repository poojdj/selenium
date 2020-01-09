package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\pooja1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://echoecho.com/htmlforms11.htm");
		WebElement itm=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[5]/tbody/tr/td/table/tbody/tr/td/select"));
		Select item=new Select(itm);
		List<WebElement> items= item.getOptions();
		System.out.println("Total items are "+items.size());
		for(WebElement w:items)
            System.out.println(w.getText());
		System.out.println();
		System.out.println("Default selected item is "+item.getFirstSelectedOption().getText());
		item.selectByVisibleText("Hot Bread");
		System.out.println("Selected item is "+item.getFirstSelectedOption().getText());
		

	}

}
