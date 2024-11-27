package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import constant.Constant;

public class ExcelUtilities {
	 static FileInputStream fi;
	  static XSSFWorkbook wk;
	  static XSSFSheet sh;
	  public static String getStringName(int a,int b,String sheet) throws IOException
	  {
		  String filepath=Constant.Testdata;
		  fi=new FileInputStream(filepath);
		  wk=new XSSFWorkbook(fi);
		  sh=wk.getSheet(sheet);
		  XSSFRow rw=sh.getRow(a);
		 XSSFCell c=rw.getCell(b);
		return c.getStringCellValue();
	  }
	  public static String getNumberValue(int a, int b,String sheet) throws IOException
	  {
		  String filepath=Constant.Testdata;
		  fi=new FileInputStream(filepath);
		  wk=new XSSFWorkbook(fi);
		  sh=wk.getSheet(sheet);
		  XSSFRow rw=sh.getRow(a);
		 XSSFCell c=rw.getCell(b);
		 int value=(int) c.getNumericCellValue();
		return String.valueOf(value);
	  }
	  
		  
		

}
