package day30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		// driver.findElement(By.xpath("//input[@name=\"mytext1\"]")).click();
		
		//frame1
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@name=\"mytext1\"]")).sendKeys("welcome");
		driver.switchTo().defaultContent();// go back to page

		//frame2
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name=\"mytext2\"]")).sendKeys("frmae2");
		driver.switchTo().defaultContent();
		
		//frame3
		WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name=\"mytext3\"]")).sendKeys("frame3");
		//driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//div[@class=\"AB7Lab Id5V1\"])[2]")).click();

	}
}
