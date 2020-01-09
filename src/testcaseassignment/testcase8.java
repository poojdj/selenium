package testcaseassignment;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class testcase8 {
	private File file;
	private FileInputStream fis;
	 private FileOutputStream fos;
		private HSSFWorkbook wb;
		private HSSFSheet sh;
		private HSSFRow rw;
		private HSSFCell cl;
		WebDriver driver;
		int rCount,cCount,row,col,i=1,j=3,k=4;
		String shName,act;
		
		
		
  @Test(dataProvider = "getData")
  public void f(String un, String pwd,String exp) throws IOException {
	  driver.findElement(By.xpath("//input[@name='session_key']")).sendKeys(un);
	  driver.findElement(By.xpath("//input[@name='session_password']")).sendKeys(pwd);
	  driver.findElement(By.xpath("//button[@class='sign-in-form__submit-btn']")).click();
	  act=driver.findElement(By.xpath("/html/body/nav/section[2]/form/div[1]/div[1]/p")).getText();
	  fos=new FileOutputStream(file);
	  rw=sh.getRow(i);
	  cl=rw.createCell(j);
	  cl.setCellValue(act);
	  cl=rw.createCell(k);
	  if(act.equals(exp)) {
		  cl.setCellValue("Pass");
	  }
	  else
	  {
		  cl.setCellValue("Fail");
	  }
	  i++;
	  wb.write(fos);
	  fos.close();
	  
	  
	  
  }
  @AfterMethod
  public void afterMethod() {
	  driver.findElement(By.xpath("//input[@name='session_key']")).clear();
	  driver.findElement(By.xpath("//input[@name='session_password']")).clear();
	  
  }


  @DataProvider
  public Object[][] getData() {
	  rCount=sh.getPhysicalNumberOfRows();//4
	    cCount=sh.getRow(0).getPhysicalNumberOfCells();//3
	    Object[][]data=new Object[rCount-1][cCount-2];
	    for(row=0;row<rCount-1;row++)
	    {
	    	rw=sh.getRow(row+1);
	    	for(col=0;col<cCount-2;col++)
	    	{
	    		cl=rw.getCell(col);
	    		data[row][col]=cl.getStringCellValue();
	    	}
	    	
	    }
	    return data;

   
    };
  
  @BeforeTest
  public void beforeTest() throws IOException {
	  file=new File("D:\\New folder\\Excel\\book1.xls");
	  fis=new FileInputStream(file);
	  wb=new HSSFWorkbook(fis);
	  shName=wb.getSheetName(0);
	  sh=wb.getSheet(shName);
	  System.setProperty("webdriver.chrome.driver","D:\\pooja1\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.linkedin.com/");
  }

  @AfterTest
  public void afterTest() throws IOException {
	  wb.close();
	  fis.close();
	  driver.close();
	  
  }

}
