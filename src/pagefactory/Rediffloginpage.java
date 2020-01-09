package pagefactory;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Rediffloginpage {
	WebDriver driver;
	Alert alt;
	String exp="Please enter your password",act;
	@FindBy(id="login1")
	WebElement uName;
	@FindBy(id="password")
	WebElement passwd;
	@FindBy(name="proceed")
	WebElement loginButton;
	@FindBy(id="remember")
	WebElement cb;
	@FindBy(partialLinkText="Create a")
	WebElement reglink;
	//Constructor
		public Rediffloginpage(WebDriver driver){
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		public void setUname(String un){
			uName.sendKeys(un);
		}
		public void setPassword(String pwd){
			passwd.sendKeys(pwd);
		}
		public void clickOnGo(){
			loginButton.click();
		}
		public void validateAlert(){
			alt = driver.switchTo().alert();
			act = alt.getText();
			if(act.equals(exp)){
				System.out.println("Pass");
			}
			else{
				System.out.println("Fail");
			}
			alt.accept();
			driver.switchTo().defaultContent();
		}
		public void testMsg(String un){
			this.setUname(un);
			this.clickOnGo();
			this.validateAlert();
		}
		public void newAccount(){
			reglink.click();
		}
		public void checkStatusofcb(){
			System.out.println(cb.isDisplayed());
			System.out.println(cb.isEnabled());
			System.out.println(cb.isSelected());
		}
	



	
	
	
	

	}


