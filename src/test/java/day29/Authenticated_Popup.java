package day29;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authenticated_Popup {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		//we can't handle this type of alerts normally have to avoid
		
		//passing USN & PWD in the url itself to avoid the pop ups
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}
