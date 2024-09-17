package day29;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()=\"Click for JS Alert\"]")).click();
		Alert myalert = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(myalert.getText());
		myalert.accept();

		driver.findElement(By.xpath("//button[text()=\"Click for JS Confirm\"]")).click();
		Alert myalert1 = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(myalert.getText());
		myalert1.accept();

		driver.findElement(By.xpath("//button[text()=\"Click for JS Confirm\"]")).click();
		Alert myalert2 = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(myalert.getText());
		myalert1.dismiss();

		driver.findElement(By.xpath("//button[text()=\"Click for JS Prompt\"]")).click();
		Alert myalert3=driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(myalert.getText());
		myalert3.sendKeys("accept");
		myalert3.accept();

	}

}
