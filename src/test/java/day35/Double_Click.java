package day35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");

		driver.switchTo().frame("iframeResult");
		WebElement box1 = driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement box2 = driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));

		box1.clear();
		box1.sendKeys("WELCOME");

		Actions act = new Actions(driver);
		act.doubleClick(button).build().perform();

		String Text=box2.getAttribute("value");
		if (Text.equals("WELCOME")) {
			System.out.println("Copied text is same");
		} else {
			System.out.println("Text not copied properly");
		}

	}

}
