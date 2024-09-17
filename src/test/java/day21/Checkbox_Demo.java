package day21;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_Demo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		List<WebElement> Checkboxes = driver
				.findElements(By.xpath("//input[@class=\"form-check-input\"][@type=\"checkbox\"]"));
		/*
		 * for( WebElement check:Checkboxes) { check.click();
		 * 
		 * }
		 */
		for (int i = 0; i < 4; i++) {
			Checkboxes.get(i).click();
		}
		Thread.sleep(2000);

		for (int i = 0; i < Checkboxes.size(); i++) {
			if (Checkboxes.get(i).isSelected()) {

				Checkboxes.get(i).click();
			}
		}
	}
}
