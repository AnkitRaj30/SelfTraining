package webDriverExamples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class Exp_Excel {
//public static void main(String args[]) 
	@Test
public void Exp_Excel() throws Exception {
	FileInputStream file = new FileInputStream("D:\\Internship project 2020\\Software Testing (Selenium)\\Excel File\\OneDrive-2021-09-04\\ReadExcel1.xls");
	Workbook wb = Workbook.getWorkbook(file);
	Sheet st = wb.getSheet(0);
	int rowcount = st.getRows();
	System.out.println(rowcount);
	for(int i =1;i<rowcount;i++) {
	String empid = st.getCell(0,i).getContents();
	String empname = st.getCell(1,i).getContents();
	String empmail = st.getCell(2,i).getContents();
	String empno = st.getCell(3,i).getContents();
	System.out.println(empid);
	System.out.println(empname);
	System.out.println(empmail);
	System.out.println(empno);
}
}
}