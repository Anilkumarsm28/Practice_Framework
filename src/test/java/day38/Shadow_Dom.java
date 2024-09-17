package day38;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shadow_Dom {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://dev.automationtesting.in/shadow-dom");
		SearchContext shadow = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
		Thread.sleep(1000);
		shadow.findElement(By.cssSelector("#shadow-element")).click();

	}

}
