package pomtestassignment;

import org.testng.annotations.Test;

import pomPage.RediffLoginPage;
import pompageassignment.Rediffaccountcreate;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class rediffaccountcreatetest {
	private WebDriver driver;
	private Rediffaccountcreate rac;
  @Test
  public void CheckAlert() {
	  rac.setUname("poojajadhav");
	  rac.setrediffID("jadhavpooja");
	  rac.setPassword("poo");
	  rac.setmobileno("8277431071");
	  rac.setdob("04");
	  rac.setmonth("09");
	 rac.setyear("1997");
	  rac.setgender("female");
	  rac.setcountry("india");
	  rac.setcity("pune");
	  rac.clickOnGo();
	  rac.validateAlert();
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\pooja1\\chromedriver.exe");


	  driver = new ChromeDriver();
	 // System.setProperty("webdriver.chrome.driver", "G:\\New folder\\chromedriver.exe");
	  //driver.manage().window().maximize();
	  driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
	  rac = new Rediffaccountcreate(driver);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
