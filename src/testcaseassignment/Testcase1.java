package testcaseassignment;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testcase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the choice of browser to launch");
		System.out.println("1.Chrome");
		System.out.println("2.Firefox");
	    int ch=sc.nextInt();
        switch(ch) 
          {
             case 1:
            	 System.setProperty("webdriver.chrome.driver","D:\\pooja1\\chromedriver.exe");
         		WebDriver driver=new ChromeDriver();
         		driver.get("https://in.ebay.com/");
         		break;
    
             case 2:	
         		System.setProperty("webdriver.gecko.driver", "D:\\pooja1\\geckodriver.exe");
        	    driver =new FirefoxDriver();
        		driver.get("https://in.ebay.com/");
        		break;
            	 
        		default:
        			System.out.println("Enter valid browser choice");
        			break;

	
          }
	}
}

