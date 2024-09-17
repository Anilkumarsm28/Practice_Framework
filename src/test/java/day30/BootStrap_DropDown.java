package day30;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrap_DropDown {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
		
		// opens drop down option.
		driver.findElement(By.xpath("//button[contains(@class,\"multiselect\")]")).click();
		// Selecting single check box java in drop down
		driver.findElement(By.xpath("//input[@value=\"Java\"]")).click();

		//Capturing all the elements
		List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,\"multiselect\")]//label"));
	
		//Selecting multiple options
		for (WebElement opt : options) {
			String option=opt.getText();
			System.out.println(opt.getText());
			if(option.equals("java") || option.equals("Python")) {
				opt.click();
			}
		}

	}

}
