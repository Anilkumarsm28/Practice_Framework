package day37;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_LInks_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("http://www.deadlinkcity.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));

		for (WebElement attlinks : links) {
			String hrefattvalue = attlinks.getAttribute("href");

			if (hrefattvalue == null || hrefattvalue.isBlank()) {
				System.out.println("Can not be validated");
				continue;
			}
			try {
				URL linkURL = new URL(hrefattvalue);
				HttpURLConnection conn = (HttpURLConnection) linkURL.openConnection();
				conn.connect();

				if (conn.getResponseCode() >= 400) {
					System.out.println(hrefattvalue + " is a broken link");
				} else {
					System.out.println(hrefattvalue + " is not a broken link");
				}

			} catch (Exception e) {
			}
		}
	}

}
