package day32;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automatic_DropDowns {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	
	//locating the search text fied and sending selenium as the value
	driver.findElement(By.name("q")).sendKeys("selenium");
	Thread.sleep(3000);
	
	List<WebElement> list=driver.findElements(By.xpath("//ul[@role=\"listbox\"]//li//div[@role=\"option\"]"));

	System.out.println(list.size());
	
	for(WebElement opt:list) {
		System.out.println(opt.getText());
		if(opt.getText().equals("selenium")) {
			opt.click();
			break;
		}
	}
	}

}
