package day21;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle()); 
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Releases")).click();
		Thread.sleep(2000);

		driver.findElement(By.partialLinkText("Electronic")).click();
		//driver.close();
	}

}
