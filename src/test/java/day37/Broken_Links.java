package day37;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_Links {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://www.deadlinkcity.com/");

		// capturing all the links from the website
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links " + links);

		for (WebElement linkElement : links) {
			String hreflinks = linkElement.getAttribute("href");

			if (hreflinks == null || hreflinks.isEmpty()) {
				System.out.println("Not possible to check the links");
				continue;
			}
			try {
				URL linkURL = new URL(hreflinks);
				HttpURLConnection conn = (HttpURLConnection) linkURL.openConnection();
				conn.connect();

				if (conn.getResponseCode() >= 400) {
					System.out.println(hreflinks + "-->Broken link");
				} else {
					System.out.println(hreflinks + "Not a Broken link");
				}
			} catch (Exception e) {
			}
		}
	}
}
