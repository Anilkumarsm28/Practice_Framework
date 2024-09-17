package day32;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_WebTable {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		// find the total number of rows in a table
		int rows = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr")).size();
		System.out.println("Number of rows:" + rows);

		// total number of columns in a table
		int columns = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr[1]//th")).size();
		System.out.println("total number of columns in a first row are: " + columns);

		// to get the value from the specific row and column(4th row & 2nd column)
		String value = driver.findElement(By.xpath(" //table[@name=\"BookTable\"]//tr[4]//td[2]")).getText();
		System.out.println("4th row & 2nd column value is: " + value);

		// to read the values from all the columns and rows
	//	for (int i = 2; i <= rows; i++) {
		//	for (int j = 1; j <= columns; j++) {
			//	String values = driver
				//		.findElement(By.xpath(" //table[@name=\"BookTable\"]//tr[" + i + "]//td[" + j + "]")).getText();
			//	System.out.print(values + "\t");
		//	}
			//System.out.println();
	//	}
		for (int i= 2; i <= rows; i++) {
			String values = driver
					.findElement(By.xpath(" //table[@name=\"BookTable\"]//tr["+i+"]//td[2]")).getText();
			if(values.equals("Mukesh")) {
				String options=driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+i+"]//td[1]")).getText();
				System.out.println(options);
				
			}
		}
		
	}
	

}
