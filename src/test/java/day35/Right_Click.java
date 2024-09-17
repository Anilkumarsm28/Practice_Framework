package day35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_Click {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

		// Right click action
		Actions act = new Actions(driver);
		act.contextClick(button).build().perform();
		
		//clicking on paste 
		driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-paste']")).click();

		//alert accepting
		driver.switchTo().alert().accept();
		
	}

}
