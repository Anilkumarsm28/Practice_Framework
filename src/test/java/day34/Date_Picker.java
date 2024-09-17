package day34;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_Picker {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);

		// Expected year and month
		String year = "2025";
		String month = "May";
		String day = "25";

		// clicking on date picker
		driver.findElement(By.id("datepicker")).click();

		while (true) {

			String cuurentmonth = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
			String cuurentyear = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();

			if (cuurentmonth.equals(month) && cuurentyear.equals(year)) {
				break;
			}
			driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-e\"]")).click();
		}

		List<WebElement> dates = driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tbody//tr//td"));

		for (WebElement op : dates) {
			if (op.getText().equals(day)) {
				Thread.sleep(3000);
				op.click();
				break;
			}
		}

	}

}
