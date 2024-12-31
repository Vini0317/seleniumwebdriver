package datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class data_driven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file= new FileInputStream("C:\\Users\\Vinita Mathur\\eclipse-workspace\\seleniumwebdriver\\test_data\\data.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int totalRows=sheet.getLastRowNum();
		int totalCells=sheet.getRow(1).getLastCellNum();
		System.out.println("Printing total rows:" +totalRows);//5
		System.out.println("Printing total rows:" +totalCells);//4
		for(int r=0;r<=totalRows;r++) {
			XSSFRow currentRow= sheet.getRow(r);
			for(int c=0;c<totalCells;c++) {
				
				XSSFCell cell=currentRow.getCell(c);
				System.out.print(cell.toString()+"\t");
			}
			System.out.println();
		}
		workbook.close();
		file.close();



	}

}
