package day35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hower {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		WebElement desktop = driver.findElement(By.linkText("Desktops"));
		WebElement mac= driver.findElement(By.xpath("//a[@class='nav-link'][normalize-space()='Mac (1)']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(desktop).moveToElement(mac).click().build().perform();
		
		

	}

}
