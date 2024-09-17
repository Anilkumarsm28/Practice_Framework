package day34;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Date_PickerDemo {

	// user defined method for converting month from string--->Month
	static Month convertMonth(String month) {
		HashMap<String, Month> monthMap = new HashMap<String, Month>();

		monthMap.put("January", Month.JANUARY);
		monthMap.put("February", Month.FEBRUARY);
		monthMap.put("March", Month.MARCH);
		monthMap.put("April", Month.APRIL);
		monthMap.put("May", Month.MAY);
		monthMap.put("June", Month.JUNE);
		monthMap.put("July", Month.JULY);
		monthMap.put("August", Month.AUGUST);
		monthMap.put("September", Month.SEPTEMBER);
		monthMap.put("October", Month.OCTOBER);
		monthMap.put("November", Month.NOVEMBER);
		monthMap.put("December", Month.DECEMBER);

		Month vmonth = monthMap.get(month);
  
		if (vmonth == null) {
			System.out.println("invalid month..." +month);
		}
		return vmonth;
	}

	static void selectdate(WebDriver driver,String reqmonth, String date, String year ) {

		WebElement yeardropdown = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select selectyear = new Select(yeardropdown);
		selectyear.selectByVisibleText(year);

		while (true) {// selecting month
			String displayedMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();

			System.out.println(displayedMonth);
			
			// converting String type of month into Month type
			Month current_month =convertMonth(displayedMonth);
			Month expected_month = convertMonth(reqmonth);

			// comparing the months
			int res = expected_month.compareTo(current_month);
			// it will throw 0 if the result is equal & >o if greater & <0 if lesser
			if (res < 0) {
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			} else if (res > 0) {
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}

			else {
				break;
			}

		}
		List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));

		for (WebElement dt : alldates) {
			if (dt.getText().equals(date)) {
				dt.click();
				break;
			}
		}
	}

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.switchTo().frame("frame-one796456169");

		// Expected date
		String year = "2025";
		String reqmonth ="June";
		String date = "1";

		driver.findElement(By.xpath("//span[@class=\"icon_calendar\"]")).click();

		// selecting year
		selectdate(driver, reqmonth,date,year );
	}
}
