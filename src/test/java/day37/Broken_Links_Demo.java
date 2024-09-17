package day37;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_Links_Demo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://www.deadlinkcity.com/");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Toatal Links" + links.size());

		for (WebElement hrefAtt : links) {
			String hrefAttValues = hrefAtt.getAttribute("href");
			if (hrefAttValues == null || hrefAttValues.isBlank()) {
				System.out.println("Not able ti validate");
				continue;
			}
			try {
				URL linkURL = new URL(hrefAttValues);
				HttpURLConnection conn = (HttpURLConnection) linkURL.openConnection();
				conn.connect();

				if (conn.getResponseCode() >= 400) {
					System.out.println(hrefAttValues + " is a broken link");
				} else {
					System.out.println(hrefAttValues + " is not a broken link");
				}
			}

			catch (Exception e) {
			}
		}
	}
}
