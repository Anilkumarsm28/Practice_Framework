package day39;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Reading_Data_Excel {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\testData\\testdata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("sheet1");
		int totalRows = sheet.getLastRowNum();
		int totalcells = sheet.getRow(1).getLastCellNum();
		System.out.println("Total number of rows are " + totalRows);
		System.out.println("Total number of cells are " + totalcells);
		for (int r = 0; r <= totalRows; r++) {
			XSSFRow cuurentRow = sheet.getRow(r);
			for (int c = 0; c < totalcells; c++) {
				XSSFCell cells = cuurentRow.getCell(c);
				System.out.print(cells.toString() + "\t");
			}
			System.out.println("");
		}
		workbook.close();
		file.close();

	}

}
