package excelhandling;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.AfterTest;

public class New {
	private File file;
	private HSSFWorkbook wb;
	private HSSFSheet sh;
	private HSSFRow rw;
	private HSSFCell cl;
	private FileInputStream fis;
	private String fpath="D:\\New folder\\Excel\\MyExcel.xls";
	private String shNm,data;
	
	  @Test
  public void Readsingledata() {
	
		  rw=sh.getRow(0);
		  cl=rw.getCell(0);
		  data=cl.getStringCellValue();
		  System.out.println(data);
		  
	  
	  
  }
  @BeforeTest
  public void beforeTest() throws IOException {
	  file=new File(fpath);
	  fis=new FileInputStream(file);
	  wb=new HSSFWorkbook(fis);
	  shNm=wb.getSheetName(0);
	  sh=wb.getSheet(shNm);
  }

  @AfterTest
  public void afterTest() throws IOException {
	  wb.close();
	  fis.close();
  }

}
