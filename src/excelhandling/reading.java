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

public class reading{
	private File file;
	private HSSFWorkbook wb;
	private HSSFSheet sh;
	private HSSFRow rw;
	private HSSFCell cl;
	private FileInputStream fis;
	private String fpath="D:\\New folder\\Excel\\MyExcel9.xls";
	private String shNm,data;
	private int rowcount,colcount,row,col;
  @Test
  public void f() {
	  rowcount=sh.getPhysicalNumberOfRows();//3
	  colcount=sh.getRow(0).getPhysicalNumberOfCells();//3
	  System.out.println("Row Count:"+rowcount+"\tColumn Count:"+colcount);
	  for(row=0;row<rowcount;row++)
	  {
		  rw=sh.getRow(row);
	  for(col=0;col<colcount;col++)
	  {
		  cl=rw.getCell(col);
	  //system.out.println(cl.getStringCellValue()+"\t");
	  data=cl.getStringCellValue();
	  System.out.print(data+"\t");
	  }
	  }
  System.out.println();
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
