package launchingBrowsers;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Launchingallbrowsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the browser of your choice");
		System.out.println("1.chrome");
		System.out.println("2.firefox");
		System.out.println("3.internetexplorer");
		int c=sc.nextInt();
		switch(c)
		{
		  case 1: System.setProperty("webdriver.chrome.driver", "D:\\pooja1\\chromedriver.exe");
                    driver=new ChromeDriver();
		             driver.get("https://www.google.com/");
		break;
		case 2: System.setProperty("webdriver.gecko.driver", "D:\\pooja1\\geckodriver.exe");
                   driver= new FirefoxDriver();
		          driver.get("https://www.google.com/");
		break;
		case 3: System.setProperty("webdriver.ie.driver", "D:\\pooja1\\IEDriverServer.exe");
                 driver=new InternetExplorerDriver();
		        driver.get("https://www.google.com/");
         break;

		}

	}


		}
