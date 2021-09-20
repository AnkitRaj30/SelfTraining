package webDriverExamples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelData {
	public static void main(String args[]) throws Exception {
		FileInputStream FileInput = new FileInputStream("D:\\Internship project 2020\\Software Testing (Selenium)\\Excel File\\OneDrive-2021-09-04\\WriteData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(FileInput);
		XSSFSheet sheet = workbook.getSheet("test");
		System.out.println(sheet.getSheetName());
		System.out.println(sheet.getLastRowNum());
		System.out.println("Before updating Cell Data "+sheet.getRow(1).getCell(3));
		XSSFCell cell = sheet.getRow(1).getCell(3);
		cell.setCellValue("9854715");
		FileInput.close();
		FileOutputStream FileOut = new FileOutputStream("D:\\Internship project 2020\\Software Testing (Selenium)\\Excel File\\OneDrive-2021-09-04\\WriteData.xlsx");
		workbook.write(FileOut);
		System.out.println("Updated data after write is done "+cell.getStringCellValue());
		FileOut.close();
	}

}
