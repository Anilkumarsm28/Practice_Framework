package day35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement washington=driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement italy=driver.findElement(By.xpath("//div[@id='box106']"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(washington, italy).build().perform();
		
	}
}
