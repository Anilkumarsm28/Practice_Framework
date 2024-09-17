package day36;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jscript_Executor_Demo {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//sending values using javascriptexecutor(when we get element interceptedexception)
		WebElement searchtextfield=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		js.executeScript("arguments[0].setAttribute('value','jhon')", searchtextfield);
		
		//scroll down page by pixel number
		//js.executeScript("window.scrollBy(0,2000)", "");
		
		WebElement ele=driver.findElement(By.xpath("//strong[@class='poll-display-text']"));
		//js.executeScript("arguments[0].scrollIntoView();", ele);
		
		//scroll to page end
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		//to know how much pixel the scroll bar is moved
		System.out.println(js.executeScript("return window.pageYOffset;"));  
		
		
		//clicking on radio button 
		WebElement radiobutton=driver.findElement(By.xpath("//input[@id='pollanswers-3']"));
		js.executeScript("arguments[0].click()", radiobutton);
		
		
	}

}
