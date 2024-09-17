package day30;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Handling {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement dropdowns = driver.findElement(By.xpath("//select[@id=\"country\"]"));
		Select dropdown = new Select(dropdowns);
		dropdown.selectByVisibleText("Canada");
		List<WebElement> options = dropdown.getOptions();
		// to get the number of options
		System.out.println(options.size());

		// to print all options
		/*
		 * for(int i=0; i<options.size();i++) {
		 * System.out.println(options.get(i).getText()); }
		 */

		// to print all options using enhanced for loop
		for (WebElement opt : options) {
			System.out.println(opt.getText());
		}

	}

}
