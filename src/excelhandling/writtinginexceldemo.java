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

public class writtinginexceldemo {
	private File file;
	private String fpath="D:\\New folder\\Excel\\MyExcel9.xls";
	 private FileOutputStream fos;
	private HSSFWorkbook wb;
	private HSSFSheet sh;
	private HSSFRow rw;
	private HSSFCell cl;
	int row=0,col;
	
	@Test(dataProvider = "getData")
  public void writeinExcel(String usn, String pwd) {
		col=0;
		rw=sh.createRow(row);
		cl=rw.createCell(col);
		cl.setCellValue(usn);
		cl=rw.createCell(col+1);
		cl.setCellValue(pwd);
		row++;
}

  @DataProvider
  public Object[][] getData() {
	  Object[][] data=new Object[3][2];
	  data[0][0]="Usn";
	  data[0][1]="Pwd";
	  data[1][0]="Pooja";
	  data[1][1]="poo";
	  data[2][0]="Dhanashree";
	  data[2][1]="shree";
	  
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
	  System.out.println("Done...");
  }

}
