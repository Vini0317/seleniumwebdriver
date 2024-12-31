package datadriven;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dynamicdata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream file= new FileOutputStream("C:\\Users\\Vinita Mathur\\eclipse-workspace\\seleniumwebdriver\\test_data\\myfile1.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(); 
		XSSFSheet sheet= workbook.createSheet("Dynamic Data");
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter no.of rows");
		int rows_no=sc.nextInt();
		System.out.print("Enter no.of columns");
		int cols_no=sc.nextInt();
		for(int r=0;r<=rows_no;r++) {
			XSSFRow currentRow=sheet.createRow(r);
			for(int c=0;c<cols_no;c++) {
				XSSFCell cell=currentRow.createCell(c);
				cell.setCellValue(sc.next());
				
				
				
			}
		}
		workbook.write(file);//attach workbook to file
		workbook.close();
		file.close();
		System.out.println("File got created");
	}

}
