package day43;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Demo {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://testautomationpractice.blogspot.com/");
	Thread.sleep(5000);

	//WebElement gender=driver.findElement(By.xpath("//span[@class=\"question top_question\']"));
	//WebElement maleradiobutton=driver.findElement(By.id("RESULT_RadioButton-1_0"));
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@name=\"RESULT_TextField-0\"]")).sendKeys("Welcome");
	Thread.sleep(5000);

	/*Actions action=new Actions(driver);
	action.moveToElement(gender);
	maleradiobutton.click();
	
	WebElement jobdropdown=driver.findElement(By.xpath("//select[@class=\"drop_down\"]"));
	Select drop=new Select(jobdropdown);
	 java.util.List<WebElement> dropop=drop.getAllSelectedOptions();
	 for(WebElement option:dropop) {
		 if(option.getText().equals("QA Engineer")) {
			 option.click();
		 }
	 }
	
	
}*/
}
}
