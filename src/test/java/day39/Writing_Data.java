package day39;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writing_Data {

	public static void main(String[] args) throws IOException {

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("dynamicdata");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of Rows wanted");
		int noOfRows = sc.nextInt();

		System.out.println("Enter number of Cells wanted");
		int noOfCells = sc.nextInt();

		for (int r = 0; r <= noOfRows; r++) {
			XSSFRow currentRow = sheet.createRow(r);

			for (int c = 0; c < noOfCells; c++) {
				XSSFCell cell = currentRow.createCell(c);
				System.out.println("Enter cell value");
				cell.setCellValue(sc.nextInt());
			}
		}
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\testData\\myfile.xlsx");
		workbook.write(file);
		workbook.close();
		file.close();
		System.out.println("File is created");
	}

}
