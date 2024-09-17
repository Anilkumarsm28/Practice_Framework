package day21;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		//Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		driver.findElement(By.xpath("//input[@id=\"Wikipedia1_wikipedia-search-input\"]")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		// List<WebElement> links =
		// driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']"));
		List<WebElement> links = driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']/a"));
		//System.out.println(links.size());
		// Thread.sleep(2000);
		for (WebElement link : links) {
			System.out.println( link.getText());
			
		}
		System.out.println(links.size());
		WebElement maleradiobutton=driver.findElement(By.xpath("//input[@id=\"male\"]"));
		maleradiobutton.click();
		System.out.println(maleradiobutton.isSelected()); 
		
		//driver.close();
	}

}
