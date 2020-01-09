package pompageassignment;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Rediffaccountcreate {
	private By fullName = By.name("namee6cc3753");
	private By rediffID = By.name("logine6cc3753");
	private By password = By.name("passwde6cc3753");
	private By mobileno = By.id("mobno");
	private By date = By.id("");
	private By month = By.id("");
	private By year = By.id("");
	private By gender = By.name("gendere6cc3753");
	private By country = By.id("country");
	private By city = By.name("citye6cc3753");
	private By go = By.id("Register");
	private WebDriver driver;
	private Alert alt;
	String exp ="verification code filed cannot be blank",act;
	
	
	//Constructor
		public Rediffaccountcreate(WebDriver driver){
			this.driver = driver;
		}
		public void setUname(String un){
			driver.findElement(fullName).sendKeys(un);
		}
		public void setrediffID(String id) {
			driver.findElement(rediffID).sendKeys(id);
		}
		public void setPassword(String pwd){
			driver.findElement(password).sendKeys(pwd);
		}
		public void setmobileno(CharSequence[] no) {
			driver.findElement(mobileno).sendKeys(no);
		}
		public void setdob(String dat) {
			WebElement day=driver.findElement(day);
					WebElement day=new Select(day);
					List<WebElement> days=day.getOptions();
		driver.findElement(date).sendKeys(dat);
		}
		public void setmonth(String mont) {
			WebElement month=driver.findElement(month);
			WebElement month=new Select(month);
			List<WebElement> months=month.getOptions();
			driver.findElement(month).sendKeys(mont);
		}
		public void setyear(CharSequence[] yea) {
			WebElement year=driver.findElement(year);
			WebElement year=new Select(year);
			List<WebElement> year=year.getOptions();
			driver.findElement(year).sendKeys(yea);
		}
		public void setgender(String gen) {
			driver.findElement(gender).sendKeys(gen);
		}
		public void setcountry(String cnty) {
			driver.findElement(country).sendKeys(cnty);
		}
		public void setcity(String cty) {
			driver.findElement(city).sendKeys(cty);
		}
		public void clickOnGo(){
			driver.findElement(go).click();
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
		public void testMsg(String un,String id,String pwd,String gen,String cnty,String cty,int no){
			this.setUname(un);
			this.setrediffID(id);
			this.setPassword(pwd);
			this.setmobileno(no);
			this.setgender(gen);
			this.setcountry(cnty);
			this.setcity(cty);
		   this.clickOnGo();
			this.validateAlert();
		}
				
}


