package day30;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_DropDowns {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		// driver.manage().wait(2000);

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));

		driver.findElement(By.xpath(
				"//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='oxd-table-filter']/div[@class='oxd-table-filter-area']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[6]/div[1]/div[2]/div[1]/div[1]"))
				.click();

		// write xpath for the hidden element
		driver.findElement(By.xpath("//div[@role=\"option\"]//span[text()=\"Account Assistant\"]")).click();

		//Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.xpath("//div[@role='listbox']//span"));

		System.out.println(options.size());
		
	}

}
