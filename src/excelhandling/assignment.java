package excelhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class assignment {
   File file;
		String fpath="D:\\New folder\\Excel\\My Excel3.xls";
		FileOutputStream fos;
		HSSFWorkbook wb;
		HSSFSheet sh;
		HSSFRow rw;
		HSSFCell cl;
		int i,j;
	  @Test
	  public void f() {
		  sh=wb.createSheet("My Sheet");
		  for(int j=0;j<3;j++)
		  {
			  rw=sh.getRow(j);
			  for(int i=0;i<=4;i++)
			  {
				  
				  cl=rw.createCell(i);
			  }
			  cl.setCellValue("Row"+i+"col"+i);
		  }
	  }
	  @BeforeTest
	  public void beforeTest() throws FileNotFoundException {
		  file=new File(fpath);
		  fos=new FileOutputStream(file);
		  wb=new HSSFWorkbook();
	  }

	  @AfterTest
	  public void afterTest() throws IOException {
		 
		  wb.write(fos);
		  wb.close();
		  fos.close();
	  }
}

	

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  
