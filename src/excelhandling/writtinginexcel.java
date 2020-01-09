package excelhandling;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.AfterTest;

public class writtinginexcel {
	private File file;
	private String fpath="D:\\New folder\\Excel\\Empdetails.xls";
	private FileOutputStream fos;
	private HSSFWorkbook wb;
	private HSSFSheet sh;
	private HSSFRow rw;
	private HSSFCell cl;
	int row=0,col;
  @Test(dataProvider = "getData")
  public void WriteToExcel(String nm, String cmp,String loc) {
	  col=0;
	  rw=sh.createRow(row);
	  cl=rw.createCell(col);
	  
	  cl.setCellValue(nm);
	  cl=rw.createCell(col+1);
	 
	  cl.setCellValue(cmp);
	  cl=rw.createCell(col+2);
	  cl.setCellValue(loc);
	  row++;
}

  @DataProvider
  public Object[][] getData() {
   Object[][] data=new Object[5][3];
   data[0][0]="Name";
   data[0][1]="Company";
   data[0][2]=  "Location";
   
   data[1][0]="Diwakar";
   data[1][1]="HSBC";
   data[1][2]=  "Pune";
   
   data[2][0]="Pravin";
   data[2][1]="Asus";
   data[2][2]=  "Mumbai";
  
   data[3][0]="pooja";
   data[3][1]="Tcs";
   data[3][2]=  "pune";
  
   data[4][0]="prajkta";
   data[4][1]="wipro";
   data[4][2]=  "Pune";
   return data;
   
   
   
    };
  
  @BeforeTest
  public void beforeTest() throws FileNotFoundException {
	  file=new File(fpath);
	  fos=new FileOutputStream(file);
	  wb=new HSSFWorkbook();
	  sh=wb.createSheet("Details");
  }

  @AfterTest
  public void afterTest() throws IOException {
	  wb.write(fos);
	  wb.close();
	  fos.close();
	  System.out.println("done...");
  }

}
