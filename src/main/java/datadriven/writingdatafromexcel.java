package datadriven;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writingdatafromexcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream file= new FileOutputStream("C:\\Users\\Vinita Mathur\\eclipse-workspace\\seleniumwebdriver\\test_data\\myfile.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(); 
		XSSFSheet sheet= workbook.createSheet("Data");
		XSSFRow row1= sheet.createRow(0);
		row1.createCell(0).setCellValue("Welcome");
		row1.createCell(1).setCellValue("1234");
		row1.createCell(2).setCellValue("automation");
		
		XSSFRow row2= sheet.createRow(1);
		row2.createCell(0).setCellValue("Java");
		row2.createCell(1).setCellValue("1234");
		row2.createCell(2).setCellValue("PYTHON");
		
		XSSFRow row3= sheet.createRow(2);
		row3.createCell(0).setCellValue("Java");
		row3.createCell(1).setCellValue("1234");
		row3.createCell(2).setCellValue("PYTHON");

		workbook.write(file);
		workbook.close();
		file.close();
		System.out.println("File got created");
	}

}
