package launchingBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class LaunchingIE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "D:\\pooja1\\IEDriverServer.exe");

		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.google.com/");

	}

}
