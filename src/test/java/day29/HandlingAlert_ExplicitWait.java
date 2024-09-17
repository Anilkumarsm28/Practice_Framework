package day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAlert_ExplicitWait {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Explicit wait declaration
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()=\"Click for JS Alert\"]")).click();
		
		//Alert myalert = driver.switchTo().alert();
		Thread.sleep(2000);
		
		Alert myalert=wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(myalert.getText());  
		myalert.accept();
	}
}
