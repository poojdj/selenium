package launchingBrowsers;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launchingfirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\pooja1\\geckodriver.exe");
        WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.com/");

	}

}
