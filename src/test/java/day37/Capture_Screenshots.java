package day37;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_Screenshots {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();

		TakesScreenshot sc = (TakesScreenshot) driver;
		File sourcefile = sc.getScreenshotAs(OutputType.FILE);

		// taking screenshot of entire screen
		File targetfile = new File(System.getProperty("user.dir") + "\\screenshots\\fullpage.png");
		sourcefile.renameTo(targetfile);

		// Capturing screenshot of specific section
		// WebElement featured_products = driver
		// .findElement(By.xpath("//div[@class='product-grid
		// home-page-product-grid']"));
		// File sourcefile1 = sc.getScreenshotAs(OutputType.FILE);
		// File targetfile1=new
		// File(System.getProperty("user.dir")+"\\screenshots\\featproduct.png");
		// sourcefile1.renameTo(targetfile1);

	}

}
